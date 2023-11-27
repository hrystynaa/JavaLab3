package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class WordSorter {
    public StringBuilder sortWordsByVowels(StringBuilder text) throws IllegalArgumentException {
        if (text == null || text.length() == 0 || isWhiteSpaceOnly(text)) {
            throw new IllegalArgumentException("Error: Input text cannot be empty");
        }
        StringBuilder curWord = new StringBuilder();
        ArrayList<StringBuilder> words = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                curWord.append(c);
            } else {
                if (curWord.length() > 0) {
                    words.add(curWord);
                    curWord = new StringBuilder();
                }
            }
        }

        if (curWord.length() > 0) {
            words.add(curWord);
        }

        words.sort(Comparator.comparing(Object::toString));
        words.sort(Comparator.comparingInt(WordSorter::countVowels));

        StringBuilder sortedText = new StringBuilder();
        for (StringBuilder word : words) {
            sortedText.append(word).append(" ");
        }
        return sortedText;
    }

    private boolean isWhiteSpaceOnly(StringBuilder text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int countVowels(StringBuilder word) {
        final StringBuilder vowels = new StringBuilder("aeiouAEIOU");
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (vowels.indexOf(String.valueOf(currentChar)) != -1) {
                count++;
            }
        }
        return count;
    }
}