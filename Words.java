/*Create Words class in JAVA and then do the following:
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all Words in a String and display the count
- Display the count of word in a sentence
- Ignore corner case for if words start with space and/or punctuations*/

import java.util.*;

public class Words {

    public static void main(String[] args) {

        System.out.print("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] strArr = sentence.split(" "); // use delimiter to find a word
        int count = strArr.length;

        System.out.println("There are " + count + " word(s) in the sentence.");
    }
}
