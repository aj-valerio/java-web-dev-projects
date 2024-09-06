package org.launchcode;

import java.util.Scanner;

public class Alice {
    static public void main(String[] args){
        String Alice = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in " +
                "it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        Scanner phraseInput = new Scanner(System.in);
        System.out.println("Enter a word or phrase to search: ");
        String phrase = phraseInput.next().toLowerCase();

        boolean phraseFound = Alice.toLowerCase().contains(phrase);
        System.out.println(phraseFound);
    }
}
