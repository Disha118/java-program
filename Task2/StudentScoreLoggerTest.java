package task;


import org.junit.jupiter.api.*;

import task.StudentScoreLogger;
import task.StudentScoreTask;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentScoreLoggerTest {

	private static final String TEST_FILE = "test_scores.csv";

    @BeforeEach
    public void setup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    public void testSingleThreadWrite() throws IOException {
        StudentScoreLogger logger = new StudentScoreLogger(TEST_FILE);
        logger.logScore("Esha", 104, 88);

        List<String> lines = Files.readAllLines(Paths.get(TEST_FILE));
        assertEquals(1, lines.size());
        assertTrue(lines.get(0).contains("Esha,104,88"));
    }

    @Test
    public void testMultiThreadWrite() throws InterruptedException, IOException {
        StudentScoreLogger logger = new StudentScoreLogger(TEST_FILE);

        Thread t1 = new Thread(new StudentScoreTask(logger, "Ria", 101, 89));
        Thread t2 = new Thread(new StudentScoreTask(logger, "Diya", 102, 76));
        Thread t3 = new Thread(new StudentScoreTask(logger, "Divith", 103, 92));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        List<String> lines = Files.readAllLines(Paths.get(TEST_FILE));
        assertEquals(3, lines.size());
    }
}

