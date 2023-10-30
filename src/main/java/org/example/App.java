package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder inputText = new StringBuilder("Ознайомлення з рядками та використання основних методів їх обробки в мові програмування Java. Здобуття навичок у використанні рядків в мові програмування Java.");

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
