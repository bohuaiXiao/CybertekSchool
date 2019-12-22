package day30;

import java.util.Arrays;

public class carInventory {
    public static void main(String[] args) {
        String [] cars = {"carmake-carmodel",
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        int countChevrolet = 0;
        int countCivic = 0;
        int civicIndex=0;
        for (String eachCar :
                cars) {
          if (eachCar.contains("Chevrolet")){
              countChevrolet++;
          }else  if (eachCar.contains("Civic")){
              countCivic++;

          }
           
        }

        System.out.println("countCivic = " + countCivic);
        System.out.println("countChevrolet = " + countChevrolet);





    }
}
