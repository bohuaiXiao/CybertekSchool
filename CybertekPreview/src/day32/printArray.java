package day32;

public class printArray {
    public static void main(String[] args) {
        int []nums = {10000,3123,31231425,6543423,934858348,9887};
        printArray.printMaxOfIntArray(nums);
        printArray.printSumOfIntArray(nums);
        int [] score = {90,50,99,59,62,49,60};
        printArray.checkScoresAllMoreThan60(score);
    }
        // printMaxOfIntArray
     public static void printMaxOfIntArray(int[] nums ){

        int max= nums[0];
         for (int i = 0; i < nums.length; i++) {
             if (nums[i]>max){
                 max = nums[i];
             }
         }
         System.out.println("Manx = "+max);
     }
// this method has one int array as parameter
// and it will print the max number inside the array
// printMinOfIntArray
// this method has one int array as parameter
// and it will print the min number inside the array
// printSumOfIntArray
// this method has one int array as parameter
// and it will print the sum of all the numbers
    public static void printSumOfIntArray(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }
        System.out.println("The Sum = "+ sum);
    }
// OPTIONALLY
// checkScoresAllMoreThan60
// this method has one int array as parameter
// and it will check whether each and every numbers are more than 60
// if so print everyone passed
// if not print someone has failed
    public static void checkScoresAllMoreThan60(int[] score){
        for (int i = 0; i < score.length; i++) {
            if (score[i]>=60){
                System.out.println(score [i]+" passed");
            }else {
                System.out.println(score [i]+" has failed ");
            }
        }
    }



    }
