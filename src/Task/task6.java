package Task;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        //Task 6:
        //Ask user to enter full name
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name!");
        String name = scan.nextLine();
        //assuming full name is 2 word
        //Write a program generate email account as below:
        //it starts with first character of first name
        char firstCharacter = name.charAt(0);
        int firstSpace = name.indexOf(" ");
        String lastName = name.substring(firstSpace+1);
        System.out.println(firstCharacter+lastName+"@NightWatch.com");
        //and whole last name then @NightWatch.com
        //for example :
        //Jon Snow -->> JSnow@NightWatch.com


    }
}
