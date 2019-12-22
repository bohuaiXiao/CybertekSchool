package day17;

public class Repl_81 {
    public static void main(String[] args) {
        //Write a program that will print out even numbers from 2 to 100 through the comma.
        int x=2;
        while(x<100){
            if(x%2==0){
            System.out.print(x+",");
            }
            x++;
        }
        System.out.print(x+".");
        }
    }

