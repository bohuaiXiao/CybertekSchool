package day23;

import java.util.Arrays;

public class StringTask02 {
    public static void main(String[] args) {
        double [] price ={2.99,3.13,1.56};
        String priceForString = Arrays.toString(price);
        System.out.println(priceForString);
        for (int i = 0; i <priceForString.length() ; i++) {
            System.out.println("Character index is :"+i+"--->"+
                    priceForString.charAt(i));
        }

    }
}
