package day20;

import java.util.Scanner;

public class repl115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        //write code below
        int count = 0;
        for (int i = 0; i <=9 ; i++) {
            if (nums[i]%2!=0){
                continue;
            }else{
                count++;
            }
        }
        System.out.println(count);



    }
}
