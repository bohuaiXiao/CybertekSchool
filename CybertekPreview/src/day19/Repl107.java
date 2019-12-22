package day19;

import java.util.Scanner;

public class Repl107 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        //int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        int num [] = new int[]{scan.nextInt()};

        int count = num.length;
        for (int i = 0; i < count; i++) {
            int indexNumber = num[i];
            System.out.println(indexNumber);
        }
    }
}
