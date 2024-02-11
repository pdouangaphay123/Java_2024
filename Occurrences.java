/*Create Occurrences class in JAVA and then do the following:
- Write a function that counts the number of occurrences for each integer in an int array.
Array Input: {10, 10, 5, 12, 3, 5};
Output: {10: 2, 5:2, 12:1, 3:1}*/

import java.util.*;

public class Occurrences {

    public static void main(String[] args) {

        System.out.print("Enter the length of the array: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] num = new int[length];

        System.out.println("Enter " + length + " number(s) in the array: ");

        for(int i = 0; i < num.length; i++) {

            int userInput = input.nextInt();
            num[i] = userInput;
        }

        HashMap<Integer, Integer> countMap = countFrequency(num);


        System.out.println("Array Input: " + Arrays.toString(num));
        System.out.println("Output: " + countMap);
    }

    // function to count and display frequency of numbers in the array
    public static HashMap<Integer, Integer> countFrequency(int[] num) {

        // create hashmap: key = number, values = count of frequencies
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        // populate keys with elements in the array
        for (int x : num){

            if (countMap.containsKey(x)) // if element is present in map, then increment by 1
                countMap.put(x, countMap.get(x) + 1);
            else // if only contains the key once
                countMap.put(x, 1);
        }

        return countMap;
    }
}
