package day17;

import java.util.Scanner;

public class Repl65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /* YOUR CODE HERE  the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".
        * */
        // get count of word
        int wordCount = word.length();
        //odd &&>=5
        if(wordCount%2==1&&wordCount>=5){
            // get the startPoint and end point
            int startPoint = wordCount/2-1;
            int endPoint = startPoint+3;
            System.out.println(word.substring(startPoint,endPoint));
        }else{
            System.out.println("invalid");
        }
    }
}
