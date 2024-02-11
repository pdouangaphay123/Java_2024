/*Create Vowels class in JAVA then do the following:
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all the vowels in a sentence and display the count*/

import java.util.*;

public class Vowels {

    public static void main(String[] args) {

        System.out.printf("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int count = countVowels(sentence);
        System.out.println("There are " + count + " in the sentence.");
    }

    // function to count frequency of vowel(s) in a sentence
    public static int countVowels(String sentence) {

        int count = 0; // returning count

        int i = 0;
        while(i < sentence.length()) {

            if(isVowel(sentence.charAt(i))) // condition that call to check if it is a vowel, if so then increment count
                count++;
            i++;
        }

        return count;
    }

    // function for checking if vowel
    public static boolean isVowel(char i) {

        String vowel = "AaEeIiOoUuYy"; // casing doesn't matter

        return (vowel.indexOf(i) >= 0);
    }

}
