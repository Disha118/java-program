
package task;

public class StudentScoreTask implements Runnable {
    private final StudentScoreLogger logger;
    private final String name;
    private final int rollNumber;
    private final int marks;

    public StudentScoreTask(StudentScoreLogger logger, String name, int rollNumber, int marks) {
        this.logger = logger;
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public void run() {
        try {
            logger.logScore(name, rollNumber, marks);
        } catch (Exception e) {
            System.err.println("Error logging score for " + name + ": " + e.getMessage());
        }
    }
}
