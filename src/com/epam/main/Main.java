package com.epam.main;

import static com.epam.main.Decode.decode;
import static com.epam.main.Encode.encode;
import static com.epam.main.Key.generateKey;
import static com.epam.main.ReadFile.readFile;
import static com.epam.main.WriteFile.writeFile;

public class Main {
    public static void main(String[] args) {
        String key = generateKey();
        writeFile(encode(readFile("default.txt"), key),"coded.txt");
        writeFile(decode(readFile("coded.txt"), key), "decoded.txt");
    }
}