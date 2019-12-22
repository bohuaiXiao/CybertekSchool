package day17;

public class SkipCounting {
    public static void main(String[] args) {
        // Skip counting by 3  from 0 till to 30
        int count =0;
        while(count<30){
            if(count%2==0){// count%2==1
            System.out.print("Give me "+count+"k,");}
            count ++;

        }
        System.out.println("Give me "+count+"k!");

    }
}
