package org.example;

import java.util.Comparator;
public class WordComparator implements Comparator<String> {
    @Override
    public int compare(String word1, String word2){
        return Integer.compare(WordSorter.countVowels(word1),WordSorter.countVowels(word2));
    }
}
