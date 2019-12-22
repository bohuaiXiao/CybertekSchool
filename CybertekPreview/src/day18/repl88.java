package day18;

import java.util.Scanner;

public class repl88 {
    public static int appearNumber(String srcText,String findText){
        int count =0;
        int index =0;
        while((index= srcText.indexOf(findText,index))!=-1){
            index=index+findText.length();
            count++;

        }return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
       countOfCats= appearNumber(word,"cat");
       countOfDogs = appearNumber(word,"dog");
       if(countOfCats==countOfDogs){
           System.out.println("True");
       }else{
           System.out.println("false");
       }


    }
}
