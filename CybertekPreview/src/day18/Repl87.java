package day18;

import java.util.Scanner;

public class Repl87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        if(inhabitants>0){
            while(inhabitants>1){
                for (int i = 0; inhabitants>0 ; i++) {//days keep going until inhabitant=0;
                    System.out.println("Day " + i + " [" + inhabitants + "]");
                    inhabitants/=2;
                }
            }
        }else {}
        System.out.println("---- EXTINCT ----");
        }



    }

