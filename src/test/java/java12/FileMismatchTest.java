package java12;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileMismatchTest {

    @Test
    public void shouldNotFindMismatch() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 New Features");
        Files.writeString(filePath2, "Java 12 New Features");

        long mismatch = Files.mismatch(filePath1, filePath2);
        assertEquals(-1, mismatch);
    }

    @Test
    public void shouldFindMismatch() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 New Features");
        Files.writeString(filePath2, "Java 12 Tutorial");

        long mismatch = Files.mismatch(filePath1, filePath2);
        assertEquals(8, mismatch);
    }
}