package day24;

import java.util.Arrays;
import java.util.Scanner;

public class repl124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int midIndex = nums.length/2;
        int lastIndex = nums.length-1;
        int translation =0;
        for (int i = 0; i < midIndex; i++) {
           translation=nums[i];
            nums[i]=nums[lastIndex-i];
            nums[lastIndex-i]=translation;
            }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
        }
    }

