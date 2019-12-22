package day29;

import java.util.Arrays;

public class FillUpWithArray {
    public static void main(String[] args) {

        String [] arr = new String[300];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i +" .I love Java";
        }
        System.out.println(Arrays.toString(arr)+"\t");




    }
}
