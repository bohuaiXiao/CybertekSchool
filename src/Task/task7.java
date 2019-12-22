package Task;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        //Task 7:
        //Ask user to enter valid email address
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you email address, please");
        String emailAddress = scan.nextLine();
        //for example :
        // JSnow@NightWatch.com or
        // Arya@KingsLanding.edu
        // print 3 part of the email separately
        // find the @
        int AtIndex = emailAddress.indexOf("@");
        //find the .
        int PointIndex = emailAddress.indexOf(".");
        String firsPart = emailAddress.substring(0,AtIndex);
        String SecondPart = emailAddress.substring(AtIndex+1,PointIndex);
        String ThirdPart = emailAddress.substring(PointIndex+1);
        System.out.println(firsPart);
        System.out.println(SecondPart);
        System.out.println(ThirdPart);
        // for example :
        // Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
        // Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu

    }
}
