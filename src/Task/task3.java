package Task;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Task 3:
        //Ask user to enter full name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name,please!");
        String name = scan.nextLine();
        //assuming full name is 2 word
        //Write a program to print users initials
        // first char and the char after the first space
        char theFirst = name.charAt(0);
        int theSpace = name.indexOf(" ");
        char theLast = name.charAt(theSpace+1);
        System.out.println("Initial is "+theFirst+theLast);
        //for example :
        //Jon Snow -->> Initial is JS





    }
}
