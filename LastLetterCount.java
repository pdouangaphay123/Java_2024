/*Create LastLetterCount class in JAVA and then do the following:
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all words that ends in 's' in a String and words that ends in 'y' in a String
- Switch the first instance of word that end with 's' and 'y'
- Display the new sentence where words are switched
Input:
This is used for any tool and technology.
Output:
any is used for this tool and technology.

Switched: the first occurrence of word ending with 's' and 'y'*/

import java.util.*;

public class LastLetterCount {

    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().toLowerCase();

        int count = isLastLetterCount(sentence);
        String replace = isSwitched(sentence);

        System.out.println("The number of words that end with 's' or 'y' is: " + count);
        System.out.println("Switch first occurrence of word ending with 's' and 'y':");
        System.out.println(replace);
    }

    // function to count how many words ending in 's' and 'y' in a sentence
    public static int isLastLetterCount(String sentence) {

        int count = 0;

        for(int i = 0; i < sentence.length(); i++) {

            if ((sentence.charAt(i) == 's') || (sentence.charAt(i) == 'y'))
                if (i < sentence.length() - 1 && !Character.isLetter(sentence.charAt(i + 1))) // check if next char is not a letter nor eof
                    count++;
        }
        return count;
    }

    // function to switch the words; first word ending in 's' and first word ending in 'y'
    public static String isSwitched(String sentence) {

        // pointers for indexing the first and second words in the sentence
        int firstWordStartPos = 0;
        int secondWordStartPos = 0;
        int firstWordEndPos = 0;
        int secondWordEndPos = 0;

        for(int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == 's') // find ending pos for first word ending in s
                if (i < sentence.length() - 1 && !Character.isLetter(sentence.charAt(i + 1))) { // check if next char is a letter nor eof
                    firstWordEndPos = i;
                    break;
                }
        }

        int countFirst = 0; // count the length is first word
        for(int i = firstWordEndPos; i >= 0; i--) { // traverse back to find starting pos of word ending in s

            if (sentence.charAt(i) == ' ') {
                firstWordStartPos = firstWordEndPos - countFirst;
                break;
            }
            countFirst++;
        }

        for(int i = firstWordEndPos; i < sentence.length(); i++) {

            if ((sentence.charAt(i) == 'y'))
                if (i < sentence.length() - 1 && !Character.isLetter(sentence.charAt(i + 1))) { // check if next char is a letter nor eof
                    secondWordEndPos = i;
                    break;
                }
        }

        int countSec = 0; // count the length of second word
        for(int i = secondWordEndPos; i >= 0; i--) { // traverse back to find starting pos of word ending in y

            if (sentence.charAt(i) == ' ') {
                //countSec++;
                secondWordStartPos = secondWordEndPos - countSec;
                break;
            }
            countSec++;
        }

        // string to store swapping words
        String replace1 = "";
        String replace2 = "";

        // assign replacing words; adjust for array index starting at 0 so add +1 to start and end pos in each word
        if(firstWordStartPos == 0) // corner case for if first replacement word starts at index 0
            replace1 = sentence.substring(firstWordStartPos, firstWordEndPos+1);
        else replace1 = sentence.substring(firstWordStartPos+1, firstWordEndPos+1);

        if(secondWordEndPos == sentence.length()-1) // corner case for if second replacement word is at the en of string
            replace2 = sentence.substring(secondWordStartPos+1, secondWordEndPos);
            else replace2 = sentence.substring(secondWordStartPos+1, secondWordEndPos+1);

        // replace first occurrences only
        sentence = sentence.replaceFirst(replace2, replace1);
        sentence = sentence.replaceFirst(replace1, replace2);

        return sentence;
    }
}
