/*Create Palindrome class in JAVA and then do the following:
- Ask User to enter a word or create a String variable and assign a word to it
- Reverse a String and check if string in Palindrome
Definition of Palindrome: https://www.dictionary.com/browse/palindrome*/

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toLowerCase(); // case sensitive

        String revWord = reverse(word);

        System.out.println("The word in reverse: " + revWord); // display the word in reverse

        if (word.equals(revWord)) // condition to check if string is equal if so then it is a palindrome
            System.out.println("The word " + word + " is a palindrome.");
        else System.out.println("The word " + word + " is not a palindrome.");
    }

    // reverse string function
    public static String reverse(String word) {

        StringBuilder result = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--) {

            result.append(word.charAt(i));
        }

        return result.toString();
    }

}
