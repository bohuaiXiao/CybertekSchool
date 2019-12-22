package day23;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        String[] superHero = {"BatMan","SuperMan","FlashMan","AntMan"};
        System.out.println( Arrays.toString(superHero));
        //[BatMan, SuperMan, FlashMan, AntMan]
        String saveSuperHeroInString =Arrays.toString(superHero);
        //use a String type to save
        System.out.println(saveSuperHeroInString);
        int[]num = {1,2,33,44,54,8};
        String saveNumInString = Arrays.toString(num);
        System.out.println(saveNumInString);
        int firstChar = saveNumInString.charAt(1);
        System.out.println(firstChar+"");




    }
}
