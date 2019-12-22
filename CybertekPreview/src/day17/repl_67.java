package day17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class repl_67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        //Your program should reverse a string only 5 characters long.
        int wordCount = word.length();// create a veriable for word count
        if(wordCount==5){
            // reverse word-->print the cha from last one to 0
            for(int x=4;x>=0;x--){
                System.out.print(word.charAt(x));
            }
        }else if(wordCount<5){
            System.out.println("Too short!");
        }else if (wordCount>5){
            System.out.println("Too long!");
        }
        }




    }

