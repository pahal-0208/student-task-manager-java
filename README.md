# Java Project
## Student Task Manager 
### Author Details
- Name: Pahal Babbar
- Reg No.: 24BAI10226
- Course : Programming in Java
- Repository : https://github.com/pahal-0208/student-task-manager-java
---
## Project Overiew 
The Student Task Manager (Offline-First System) is a Java-based application designed to help users manage daily tasks without requiring continuous internet connectivity. This project is based on the concept of Dew Computing, where applications operate locally and synchronize with cloud storage when connectivity becomes available.<br>

The system allows users to add, view, update, and manage tasks through a simple menu-driven interface. All tasks are stored locally using file handling techniques, ensuring that the application remains functional even in offline environments. When required, the system can simulate synchronization by updating a cloud file, demonstrating the core idea of deferred data consistency.<br>

This project emphasizes real-world problem solving, particularly for students or users in environments with unstable internet access, such as hostels or rural areas. It integrates key programming concepts including Object-Oriented Programming (OOP), file handling, collections, and exception handling.<br>

Overall, the project demonstrates how offline-first systems can improve usability and reliability, while also highlighting the trade-offs between local autonomy and data consistency, a fundamental principle of Dew Computing.<br>

---
## System Requirements
### Hardware Requirements
- Processor: Minimum Intel i3 or equivalent
- RAM: 4GB or above
- Storage: At least 100 MB free space
- Display: Any standard display<br>

### Software Requirements
- Operating System: Windows/Linux(Ubuntu)/macOS
- Programming Language: Java(JDK 8 or above)
- IDE/Editor: Any (VS Code, IntelliJ, or Terminal)
- Terminal/Command Line Interface ( for running program)

### Dependencies
- Java Compiler (javac)
- Java Runtime Environment (java)
- Basic file system support

---
## Installation Requirements
Follow these steps to run the project on your system:

### Step 1: Install Java (JDK)

#### For Ubuntu/Linux:
```bash
sudo apt update
sudo apt install default-jdk
```
### Step 2: Download or Clone the Project
#### Option 1: Clone using Git
```bash
git clone https://github.com/your-username/Student-Task-Manager-Java.git
cd Student-Task-Manager-Java
```
#### Option 2: Download ZIP
- Click on Code → Download ZIP
- Extract the folder
- Open terminal in that folder

### Step 3: Compile the Program
```bash
javac src/*.java
```
### Step 4: Run the Program
```bash
java -cp src Main
```
---
## Project Structure
```bash
StudentTaskManager/
├── src/
│   ├── Main.java          # Entry point (menu-driven program)
│   ├── Task.java          # Task class (represents a task)
│   ├── TaskManager.java   # Handles operations & file management
├── data/
│   ├── local.txt          # Stores tasks locally (offline mode)
│   ├── cloud.txt          # Simulates cloud storage (sync feature)
├── README.md              # Project documentation
```

### Explanation
- src/ → Contains all Java source code
- Main.java → Controls program flow and user interaction
- Task.java → Defines task structure using OOP
- TaskManager.java → Implements logic (add, save, load, sync)
- data/ → Stores task data using files
- local.txt → Used for offline storage
- cloud.txt → Used for simulated cloud sync
- README.md → Contains project details and instructions

---
## Key Learning Outcomes
- Developed a Java-based offline-first application using Dew Computing principles
- Gained practical understanding of Object-Oriented Programming (OOP) concepts
- Implemented file handling for local data storage and retrieval
- Learned to use Collections (ArrayList) for managing dynamic data
- Applied exception handling to make the program robust
- Understood the concept of offline functionality with later synchronization
- Improved problem-solving skills by designing a real-world application
- Learned how to structure and organize a project for GitHub submission

---
## Conclusion
The Student Task Manager (Offline-First System) successfully demonstrates the concept of Dew Computing by allowing users to manage tasks without requiring continuous internet connectivity. The application provides essential functionalities such as adding, viewing, updating, and storing tasks locally, ensuring usability even in offline environments.<br>

Through this project, key programming concepts such as Object-Oriented Programming, file handling, collections, and exception handling were effectively implemented. The synchronization feature simulates cloud interaction, highlighting the trade-off between local autonomy and data consistency.<br>

Overall, the project addresses a real-world problem faced by users with unstable internet access and showcases how offline-first systems can improve reliability and user experience. It also provides a strong foundation for future enhancements such as graphical interfaces, database integration, and real-time cloud connectivity.<br>


