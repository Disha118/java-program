1. Project Overview
The Student Exam Score Logger is a Java-based project that demonstrates how multiple threads can safely write data to a shared file.
It simulates students submitting their exam scores at the same time and ensures each entry is stored correctly in a text (CSV) file without data corruption.

 2. Objective
To implement multithreading for simultaneous score submissions.
To ensure thread-safe file writing using synchronization.
To demonstrate file handling and JUnit testing concepts in Java.

3. Core Functionality
Each student’s submission (name, roll number, marks) is handled by a separate thread.
All threads write to a common CSV file (student_scores.csv).
A synchronized method ensures only one thread writes at a time.
The file stores data in comma-separated format for easy readability.

 4. Classes Used
StudentScoreLogger.java – Contains the synchronized logScore() method that writes to the file safely.
StudentScoreTask.java – Implements Runnable and defines what each thread does.
Main.java – Creates and runs multiple threads to simulate concurrent student submissions.
StudentScoreLoggerTest.java – Contains JUnit test cases to verify correct and safe file writing.

5. Concepts Demonstrated
Multithreading – Running multiple tasks (threads) simultaneously.
Synchronization – Ensuring safe access to shared resources.
File Handling – Writing structured data to files.
JUnit Testing – Automated validation of code behavior.

6. Conclusion
The project successfully demonstrates how to combine threads, synchronization, and file handling in Java.
It ensures data consistency, thread safety, and correctness verified through JUnit tests — making it a reliable model for concurrent systems.
