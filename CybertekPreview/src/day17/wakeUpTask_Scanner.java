package day17;

import java.util.Scanner;

public class wakeUpTask_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name!");
        String fullName = scan.nextLine();
        //bohuai xiao
        //01234567890
        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0,spaceIndex);
        String lastName = fullName.substring(spaceIndex+1);
        String fixedFirstName = firstName.substring(0,1).toUpperCase();
        fixedFirstName+=firstName.substring(1).toLowerCase();
        System.out.println(fixedFirstName);

        String fixedLastName = lastName.substring(0,1).toUpperCase();
        fixedLastName+=lastName.substring(1).toLowerCase();
        System.out.println(fixedLastName);

        String fixedFullName = fixedFirstName+" "+fixedLastName;
        System.out.println(fixedFullName);

    }
}
