package day18;

import java.util.Scanner;

public class Repl86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        String nameList = " ";
        System.out.println("Please enter gust name");
        String name = input.nextLine();

        do {System.out.println("do you want add more name?");
        boolean yesOrNo = input.nextBoolean();
        System.out.println("enter");
        name = input.nextLine();
        nameList += name;
        }
        while(true);





    }
}
