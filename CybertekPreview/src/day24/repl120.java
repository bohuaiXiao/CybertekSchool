package day24;

import java.util.Scanner;

public class repl120 {
    public static void main(String[] args) {
        /*
        Given the array words, it will print the word with the largest length.
        Assume that there are no 2 words with longest length
         */
        // go over all the array;
        // check all the word length, create a verable to save the longest word
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String longestWord = "";
        int maxLength = 0;
        for (int i = 0; i <5 ; i++) {
            if (words[i].length()>maxLength){
            maxLength = words[i].length();
            longestWord = words[i];
            }
        }
        System.out.println(longestWord);




    }
}
