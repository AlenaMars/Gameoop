package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        String string = "абвгдеёжзиклмнопрстуфхцчщьъэюя";
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < string.length(); ++i) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}