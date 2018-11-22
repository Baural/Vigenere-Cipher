package com.epam.main;

import java.util.ArrayList;
import java.util.List;

public class Symbol {
    public static List<Character> symbols = new ArrayList<>();
    public static final int SYMBOL_COUNT = 26;

    static {
        for (char symbol : ("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray()) {
            symbols.add(symbol);
        }
    }
}