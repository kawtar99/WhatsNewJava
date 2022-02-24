package java11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NewFileMethodsTest {

    @Test
    public void shouldWriteReadStringFromFile() throws IOException {

        Path filePath = Files.writeString(Path.of("C:","Users", "Kawta", "Desktop", "JavaNewFeatures", "src", "main", "resources", "demo.txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        assertThat(fileContent).isEqualTo("Sample text");
    }

}