package day18;

import java.util.Scanner;

public class superHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String heroName =" ";
        /*
        * Write a program to
        * repeatedly ask user for keyword to turn into super hero
        * unless user say SHAZAM! in case insensitive manner
        * program will keep asking
        * and when you user enter Shazam! it will print you are now Super Hero!
        * */
        do {
            System.out.println("What is the hero name!");
            heroName = scanner.nextLine();
        }while (!heroName.equalsIgnoreCase("shazam"));
        System.out.println("you are hero");

    }
}
