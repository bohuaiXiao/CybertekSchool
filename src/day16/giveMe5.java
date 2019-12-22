package day16;

import java.util.Scanner;

public class giveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number!");
        int number = scan.nextInt();
        while(number!=5){
            if(number>5){
                System.out.println("too big!");
            }else if (number<5){
                System.out.println("too small");
            }
            System.out.println("try again");
            number = scan.nextInt();
        }
        System.out.println("You are right!");


    }
}
