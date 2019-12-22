package day17;

import java.util.Scanner;

public class Repl64 {
    public static void main(String[] args) {
        //You have a word, do the following:
        Scanner scan = new Scanner(System.in);
          String word = scan.next();
            //YOUR CODE HERE
        // find how many character
        int charNumber = word.length();
        //when  is odd number
        if(charNumber%2==1&&charNumber!=1){
            System.out.print(word.charAt(charNumber/2));

        }else if(charNumber==1){
            for(int x=1;x<=3;x++){
                System.out.print(word);
            }
        }else if(charNumber%2==0&&charNumber!=2){
            System.out.print(word.substring(charNumber/2-1,charNumber/2+1));
        }else if (charNumber==2){
            for (int x=1;x<=2;x++){
                System.out.print(word);
            }
        }else{
            System.out.print("invalid Word!!!");
        }

    }
}
