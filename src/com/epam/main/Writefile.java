package com.epam.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
    public static void writeFile(String text, String filename) {
        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(filename))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
