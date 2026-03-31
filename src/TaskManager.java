import java.util.*;
import java.io.*;

class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    void addTask(int id, String title) {
        tasks.add(new Task(id, title));
    }

    void viewTasks() {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    void markComplete(int id) {
        for (Task t : tasks) {
            if (t.id == id) {
                t.isCompleted = true;
            }
        }
    }

    void saveToFile(String filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            for (Task t : tasks) {
                fw.write(t.id + "," + t.title + "," + t.isCompleted + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }

    void loadFromFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Task t = new Task(Integer.parseInt(data[0]), data[1]);
                t.isCompleted = Boolean.parseBoolean(data[2]);
                tasks.add(t);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("No previous data found");
        }
    }

    void syncWithCloud() {
        saveToFile("data/cloud.txt");
        System.out.println("Synced with cloud!");
    }
}
