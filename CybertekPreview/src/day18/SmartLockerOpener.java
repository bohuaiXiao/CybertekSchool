package day18;

import java.util.Scanner;

public class SmartLockerOpener {
    public static void main(String[] args) {
        // smart lock door has password
        // unless you enter correct password
        // it keep locking you out
        // assuming correct password is B15
        // keep asking until user enter correct one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Knock KNOCK !!");
        System.out.println("What is  the password?");
        String password = scanner.nextLine();
        while(!password.equalsIgnoreCase("B15")){
            System.out.println("Wrong Password");
            System.out.println("Try again!");
            password = scanner.nextLine();
        }
        System.out.println("Welcome, Open Saseme!!!!");

    }
}
