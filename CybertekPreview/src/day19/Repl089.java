package day19;

import java.util.Scanner;

public class Repl089 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        // find the first and last index
        //first index =0; last index = length-1
        int lastIndex = word.length()-1;
        System.out.println(word.charAt(0)+""+word.charAt(lastIndex));

    }
}
