package day24;

import java.util.Scanner;

public class repl121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int evenCount =0 ;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                evenCount++;
            }
        }
        System.out.println(evenCount);

    }
}
