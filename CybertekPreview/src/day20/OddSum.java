package day20;

public class OddSum {
    public static void main(String[] args) {
        int sumOfOdd=0;
        int sumOfEven= 0;

        int oddCount =0;
        for(int i =10;i<=100;i++){
            if (i%2==1){
                sumOfOdd+=i;
                oddCount++;
            }else{
                sumOfEven+=i;
            }
        }
        System.out.println(oddCount);
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);
    }
}
