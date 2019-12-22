package day23;

import java.util.Scanner;

public class Warm_upTask {
    public static void main(String[] args) {
        int [] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int max =0;
        int min =0;
        int sum =0;
        for (int i = 0; i <7 ; i++) {
            System.out.println("Please enter the number!");
            arr[i]= scanner.nextInt();}
            System.out.println(arr[arr.length-1]);
        for (int i = 0; i < 7; i++) {


            if (max<arr[i]){
                max=arr[i];

            }
            min = arr[0];
            if (arr[i]<=min){
                min=arr[i];

            }
            sum+= arr[i];
        }
        System.out.println("Middle right"+arr[(arr.length-1)/2+1]);

        System.out.println("Sum = "+sum);
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        for (int x = 6; x >=0 ; x--) {// #1
            System.out.print(arr[x]+",");
        }





    }
}
