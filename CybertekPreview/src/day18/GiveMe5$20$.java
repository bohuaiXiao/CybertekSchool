package day18;

import java.util.Scanner;

public class GiveMe5$20$ {
    public static void main(String[] args) {
        // Keeping asking for 5$ or 20$ until you get them
        Scanner scan = new Scanner(System.in);
        System.out.println("GIVE ME 20 or 5");
        int money = scan.nextInt();
        while(money!=5&&money!=20){// Logic Error//!(money==5||money==20)
            // if the bill is not 5$ and not 20$ the result of it's 5 or 20
            // or negate the result of it's 5 or 20
            //!(x==5||x==20)
            System.out.println("Not the bill I am looking for!");
            money = scan.nextInt();
        }
        System.out.println("There you are, thank you ");


    }
}
