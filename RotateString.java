/* Create RotateString class in JAVA and then do the following:
- Ask User to enter a word or create a String variable and assign a word to it
- Write a function that rotates the letters of a string to the number of places mentioned:
For example:
String = Apple
Count = 2
Output = pleAp */

import java.util.*;

public class RotateString {

    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.print("Enter the length of the char(s) that you want to rotate in the word: ");
        int count = input.nextInt();


        String output = stringRotate(word, count);

        System.out.println("String = " + word);
        System.out.println("Count =  " + count);
        System.out.println("Output = " + output);
    }

    // function that rotates the string from left to right depending on the count
    public static String stringRotate(String word, int count){

        // store temp string for rotation
        StringBuilder temp = new StringBuilder();

        // traverse to get the chars of the string to after the expected rotating chars
        for(int i = count; i < word.length(); i++)
            temp.append(word.charAt(i));

        // append/concatenate the rotating chars
        for(int i = 0; i < count; i++)
            temp.append(word.charAt(i));

        return temp.toString();
    }
}
