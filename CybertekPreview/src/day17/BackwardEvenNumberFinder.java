package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
        //Print all the even number backward from 100-0
        int number =100;
        int sum =0;
        while(number>=0){
            if(number%2==0){
                sum=sum+number;
            }
            number--;
        }
        System.out.println(sum);


    }
}
