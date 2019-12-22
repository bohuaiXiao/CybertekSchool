package day20;

import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        // given a string variable name with value
        // reverse this name and store reversed value into
        // another String variable reversedName
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String reversedName = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName += name.charAt(i)+"";
            System.out.print(i+"Index:");
            System.out.println(name.charAt(i));
        }
        System.out.println(reversedName);

    }
}
