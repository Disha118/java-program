package task;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentScoreLogger {

	private final String filePath;

    public StudentScoreLogger(String filePath) {
        this.filePath = filePath;
    }

    // Thread-safe write
    public synchronized void logScore(String name, int rollNumber, int marks) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(name + "," + rollNumber + "," + marks);
            writer.newLine();
            System.out.println("Logged score for: " + name);
        }
    }
}


