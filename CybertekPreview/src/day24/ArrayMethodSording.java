package day24;

import java.util.Arrays;

public class ArrayMethodSording {
    public static void main(String[] args) {
        int[] scores = {99,87,96,66};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        char[] nameChar ={'b','o','h','u','a','i'};
        Arrays.sort(nameChar);

        String[] superHero = {"BatMan","SuperMan","FlashMan","AntMan"};
        Arrays.sort(superHero);
        System.out.println(Arrays.toString(superHero));
        // first char from a-z;  String sorting!!!
       // boolean[]yesOrNo = {true,false,false,true};
        // boolean cant not sort

    }
}
