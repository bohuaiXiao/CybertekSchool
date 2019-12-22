package day20;

public class WhilLoppSum {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while(x<=20){
            if(x%2==0){
                sum+=x;
            }x++;
        }
        System.out.println(sum);


    }
}
