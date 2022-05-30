package controller;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileIOControllerTest {

    @Test
    void FileIOControllerTest() {
        try {
            FileIOController.writeJSON("E://test.json", "test");
            String str = FileIOController.readJSON("E://test.json");
            assertEquals(str, "test");

            FileIOController.writeJSON("E://test.json", "123454321");
            str = FileIOController.readJSON("E://test.json");
            assertEquals(str, "123454321");

            FileIOController.writeJSON("E://aaa.json", "qaz200512");
            str = FileIOController.readJSON("E://aaa.json");
            assertEquals(str, "qaz200512");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}