package org.example;

public class App 
{
    public static void main( String[] args )
    {
        StringBuilder inputText = new StringBuilder("Familiarization with strings and use of basic methods of processing them in the Java programming language. " +
                                                    "Acquiring skills in using strings in the Java programming language.");

        try {
            WordSorter sorter = new WordSorter();
            StringBuilder sortedText = sorter.sortWordsByVowels(inputText);
            System.out.println("Input text: " + inputText);
            System.out.println("Sorted text: " + sortedText.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
