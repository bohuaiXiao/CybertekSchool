package day20;

import java.util.Scanner;

public class repl113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt()};
        // max variable = num[i]
        int maxNum =0;
        for (int i = 0; i <nums.length ; i++) {
            if (maxNum<nums[i]){
                maxNum=nums[i];
            }
        }
        System.out.println(maxNum);





    }
}
