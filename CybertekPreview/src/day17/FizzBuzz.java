package day17;

public class FizzBuzz {
    public static void main(String[] args) {
        //if a number can be divided by both3 and 5---> fizzbuzz Number
        //if a number can be divided by 5   fizz number
        //                           by 3 buzz number
        int number = 1;
        int sum =0;
        int sum1 =0;
        int sum2 =0;
        while (number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                sum+=number;
                System.out.println("FizzBuzz total is : ");
            } else if (number % 5 == 0) {
                sum1+=number;
                System.out.println("Fizz");
            } else if (number % 3 == 0) {
                sum2+=number;
                System.out.println("Buzz");
            }
            number++;
        }
    }
}
