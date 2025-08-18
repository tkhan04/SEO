package com.seogapfinder.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import static com.seogapfinder.controller.IOController.reader;

@SpringBootTest
public class IOControllerTest {

    @Test
    public void testValidUrl() {
        String content = reader("https://www.example.com");
        assertTrue(content.contains("Example Domain"), "Should contain Example Domain");
    }

    @Test
    public void testInvalidUrlFormat() {
        String content = reader("ht!tp://??");
        assertTrue(content.contains("Content can't be read"), "Should show error message for invalid URL");
    }

    @Test
    public void testUnreachableUrl() {
        String content = reader("http://nonexistentwebsite123456.com");
        assertTrue(content.contains("Content can't be read"), "Should show error for unreachable URL");
    }
}
