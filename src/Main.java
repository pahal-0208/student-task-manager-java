import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager tm = new TaskManager();

        tm.loadFromFile("data/local.txt");

        while (true) {
            System.out.println("\n1.Add Task\n2.View\n3.Mark Done\n4.Save\n5.Sync\n6.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String title = sc.nextLine();
                tm.addTask(tm.tasks.size() + 1, title);
            }
            else if (choice == 2) {
                tm.viewTasks();
            }
            else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                tm.markComplete(id);
            }
            else if (choice == 4) {
                tm.saveToFile("data/local.txt");
            }
            else if (choice == 5) {
                tm.syncWithCloud();
            }
            else {
                break;
            }
        }
    }
}
