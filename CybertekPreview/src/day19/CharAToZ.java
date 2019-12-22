package day19;

import java.util.Scanner;

public class CharAToZ {
    public static void main(String[] args) {
        ////  HOMEWORK
        //        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        Scanner scanner = new Scanner(System.in);
        char starting = scanner.next().charAt(0);
        char ending = scanner.next().charAt(0);
        //        // STARTING CHARACTER AND ENDING CHARACTER
        //        // THEN PRINT EVERYTHING IN BETWEEN
        if(starting<ending){
        for (char ichar=starting;ichar<=ending;ichar++){
            System.out.print(ichar+" ");}
        }else if (starting>ending){
            for (char iChar = starting;iChar>=ending;iChar--){
                System.out.print(iChar+" ");
            }
        }else {
            System.out.println(starting+"="+ending);
        }
        //        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        //        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        //        // Can we ask user character ? NO!!!!
        //        // Ask user for String and pick first character by charAt(0)
    }
}
