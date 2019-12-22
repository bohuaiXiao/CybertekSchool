package day17;

import java.util.Scanner;

public class ReversePrintString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name!!");
        String myName = scan.nextLine();
        int x = myName.length()-1;
        while (x>=0){
            System.out.print(myName.charAt(x));
            x--;
        }




    }
}
