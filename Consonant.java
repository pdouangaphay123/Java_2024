/*Create Consonants class in JAVA and then do the following:
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all consonants in a String and display the count
- Replace all consonants with '*' in a String*/

import java.util.Scanner;

public class Consonant {

    public static void main(String[] args) {

        System.out.print("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        countConsonants(sentence);
    }

    // function for counting the # consonants in a sentence
    public static void countConsonants(String sentence) {

        int count = 0;
        StringBuilder replace = new StringBuilder();

        // traverse through the sentence, increment count if char is a consonant, then replace with '*' if so
        for(int i = 0; i < sentence.length(); i++) {

            if (isConsonant(sentence.charAt(i))) {
                count++;
                replace.append('*');
            } else replace.append(sentence.charAt(i));
        }

        System.out.println("The number of consonants in the sentence is " + count);
        System.out.println("String modified to : " + replace);
    }

    // function checking if char is a consonant
    public static boolean isConsonant(char i) {

        String consonant = "qQwWrRtTpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM"; // casing doesn't matter

        return (consonant.indexOf(i) >= 0);
    }
}
