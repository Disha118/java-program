
package task;

public class Main {

	public static void main(String[] args) throws InterruptedException {
        StudentScoreLogger logger = new StudentScoreLogger("student_scores.csv");

        Thread t1 = new Thread(new StudentScoreTask(logger, "Ria", 101, 89));
        Thread t2 = new Thread(new StudentScoreTask(logger, "Diya", 102, 76));
        Thread t3 = new Thread(new StudentScoreTask(logger, "Divith", 103, 92));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All student scores logged successfully!");
    }
}

