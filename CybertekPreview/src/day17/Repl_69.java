package day17;

import java.util.Scanner;

public class Repl_69 {
    public static void main(String[] args) {
        //Write a program that will print out first half of the word twice.
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        //need to know the word length;
        int wordCount = word.length();
        int endPoint = wordCount/2;
        for(int x=1;x<=2;x++){
            System.out.print(word.substring(0,endPoint));
        }
    }
}
