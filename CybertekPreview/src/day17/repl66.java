package day17;

import java.util.Scanner;

public class repl66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int wordOneCount = word1.length();// get word1 count
        int wordTwoCount = word2.length();// word2 count
        if(wordOneCount==3&&wordTwoCount==3){
            for(int x=0;x<3;x++) //word1.cha(0)+word2.cha(0)
                System.out.print(word1.charAt(x)+""+ word2.charAt(x));
        }else{
            System.out.println("cannot merge");
        }
        //aok //word 1 index0+WORD2 index 0+
        //lol
        //alookl
        //
        //ear
        //pie
        //epaire
        //
        //java
        //wow





    }
}
