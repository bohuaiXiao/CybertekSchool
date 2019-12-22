package day24;

public class ArrayEquality {
    public static void main(String[] args) {
        int index =0;
        int [] number ={100,90,60,55,76,2,32,19};
        for (int i = 0; i <number.length ; i++) {
            if (number[i]==76){
                index=i;
            }
        }
        System.out.println("The seven index is "+index);



    }
}
