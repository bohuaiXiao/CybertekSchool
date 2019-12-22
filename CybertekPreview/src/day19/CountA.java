package day19;

import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count =0;
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);


    }
}
