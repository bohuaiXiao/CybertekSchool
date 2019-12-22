package day20;

import java.util.Scanner;

public class repl108 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int x = i; x <=n ; x++) {
            for (int k = j; k <=x ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
