package day19;

import java.util.Scanner;

public class warUpTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         char start = scanner.next().charAt(0);
        char end =   scanner.next().charAt(0);
        if (start<end){
            for (char i =start; i <=end ; i++) {
                System.out.print("Speeding "+i);
            }
        }else if (start>end){
            for (char i =start; i >=end ; i--) {
                System.out.print("Speeding "+i);
            }
        }

    }
}
