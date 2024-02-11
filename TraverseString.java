/*Create TraverseString Class in JAVA and then do the following:
- Ask User to enter a sentence or create a String variable to assign a sentence to it
Traverse through a string and only output the unique characters.
For example:
Input: “racecar”
Output: “race”*/

import java.util.*;

public class TraverseString {

    public static void main(String[] args) {

        System.out.print("Enter word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        // create hashset to store unique chars
        HashSet<Character> uniqueCharSet = new HashSet<Character>();
        for(int i = 0; i < word.length(); i++) {

            uniqueCharSet.add(word.charAt(i));
        }

        System.out.println("Input: \"" + word + "\"");
        System.out.print("Output: \"");
        uniqueCharSet.forEach(System.out::print); // unstable data structure, unordered
        System.out.print("\"");
    }
}
