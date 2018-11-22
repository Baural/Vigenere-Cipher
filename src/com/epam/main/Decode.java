package com.epam.main;
import static com.epam.main.Symbol.*;


public class Decode {
    public static String decode(String text, String key) {
        StringBuilder result = new StringBuilder();
        int keyIndex = 0;
        for (char textSymbol : text.toCharArray()) {
            if ((keyIndex + 1) == key.length())
                keyIndex = 0;
            if (Character.isLetter(textSymbol)) {
                int decodedSymbolIndex = (symbols.indexOf(textSymbol) + SYMBOL_COUNT - symbols.indexOf(key.charAt(keyIndex))) % SYMBOL_COUNT;
                result.append(symbols.get(decodedSymbolIndex));
            } else {
                result.append(textSymbol);
            }
            keyIndex++;
        }
        return result.toString();
    }
}
