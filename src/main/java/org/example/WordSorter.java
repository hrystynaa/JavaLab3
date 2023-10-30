package org.example;

import java.util.Arrays;

public class WordSorter {
    public StringBuilder sortWordsByVowels(StringBuilder text) throws IllegalArgumentException {
        if (text == null || text.length() == 0) {
            throw new IllegalArgumentException("Error: Input text cannot be empty");
        }

        String[] words = text.toString().split("[\\p{Punct}\\s]+");

        Arrays.sort(words);
        Arrays.sort(words, new WordComparator());

        StringBuilder sortedText = new StringBuilder();
        for (String word : words) {
            sortedText.append(word).append(" ");
        }
        return sortedText;
    }

    public static int countVowels(String word) {
        final String vowels = "аеіоуиїєюяАЕІОУИЇЄЮЯaeiouAEIOU";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}