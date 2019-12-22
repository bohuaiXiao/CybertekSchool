package Task;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //Task 4:
        //Ask user to enter a word with at least 3 characters
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word at least 3 characters");
        String wordEnter = scan.next();
        //print the first character
        System.out.println(wordEnter.charAt(0));
        //print the last character
        int lastIndex = wordEnter.length()-1;
        int middleIndex = lastIndex/2;
        System.out.println(wordEnter.charAt(lastIndex));
        System.out.println(wordEnter.charAt(middleIndex));
        //print the middle character
        //for example : Uighur
        //first character : U
        //last character  : r
        //middle character: g
        //(if the length is even number get the one on the left)
    }
}
