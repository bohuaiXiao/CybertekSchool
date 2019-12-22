package day18;

import java.util.Scanner;

public class SmartLockDOWhileVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";
        System.out.println("KNOCK KNOCK");

        do {
            System.out.println("WHAT IS THE PASSWORD?");
            password = scanner.nextLine();
        }while (!password.equals("B15"));
        System.out.println("Door open!!!!!!");


    }
}
