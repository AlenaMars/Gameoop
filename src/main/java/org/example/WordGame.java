package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        String string = "abcdefjhijklmnopqrstyvzxuz";
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < string.length(); ++i) {
            charList.add(String.valueOf(string.charAt(i)));
        }
        return charList;
    }
}
