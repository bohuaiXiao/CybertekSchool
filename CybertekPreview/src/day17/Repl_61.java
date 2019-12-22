package day17;

import java.util.Scanner;

public class Repl_61 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
        //Write a program that will print out the longest word.
        //need to gre both word count
        int wordOneCount = word1.length();
        int wordTwoCount = word2.length();
        System.out.println(wordOneCount >wordTwoCount? word1:word2);





    }
}
