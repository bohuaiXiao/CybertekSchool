package day24;

import java.util.Arrays;
import java.util.Scanner;

public class repl122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//1,1,2,3,4,3,4// 2,3,4,3,4,1,1
        //TODO: write your code below
        //all 7 int; if value=1--> skip;
        // if
        for (int outIndex = 0; outIndex < nums.length; outIndex++) {


            int count =0;
        for (int eacIndex = 0; eacIndex < nums.length; eacIndex++) {
            if (nums[eacIndex]==nums[outIndex]){
                count++;
            }

            }
            if (count==1){
                System.out.println(nums[outIndex]);
            }
        }
        }
}










