package day17;

import java.util.Scanner;

public class repl75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        // if word has x||X--->xutl
        // if word doesnt have x or X
      String firstLetter = word.substring(0,1);
      String lastLetter = word.substring(word.length()-1);
      if(firstLetter.equalsIgnoreCase("x")&&
              lastLetter.equalsIgnoreCase("X")){
          String newWord1 = word.substring(1,word.length()-1);
          System.out.println(newWord1);
      }else if(firstLetter.equalsIgnoreCase("x")){
          String newWord2 = word.substring(1);
          System.out.println(newWord2);
      }else if(lastLetter.equalsIgnoreCase("x")){
          String newWord3 = word.substring(0,word.length()-1);
          System.out.println(newWord3);
      }else{
          System.out.println(word);
      }



    }
}
