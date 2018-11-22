package com.epam.main;
import static com.epam.main.Symbol.*;

public class Encode {
    public static String encode(String text, String key) {

        StringBuilder result = new StringBuilder();
        int keyIndex = 0;
        for (char textSymbol : text.toCharArray()) {
            if ((keyIndex + 1) == key.length()) {
                keyIndex = 0;
            }
            if (Character.isLetter(textSymbol)) {
                int encodedSymbolIndex = (symbols.indexOf(Character.toUpperCase(textSymbol)) + symbols.indexOf(key.charAt(keyIndex))) % SYMBOL_COUNT;
                result.append(symbols.get(encodedSymbolIndex));
            } else {
                result.append(textSymbol);
            }

            keyIndex++;
        }
        return result.toString();
    }
}
