package day23;

import java.util.Arrays;

public class TaskNewWave {
    public static void main(String[] args) {
        //Create a String array of 6 items to store groceryItems
        String[] groceryItem = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        //Create a float array of 6 float values to store prices
        double[] price = {1.99, 0.99, 4, 65, 3.89, 3.88, 2.88};
        //assume that the order of grocery Items match the prices in same order.
        //Do below tasks :
        //1, loop through each grocery items and print them in one line
        for (int i = 0; i < 6; i++) {
            System.out.println("GroceryItem " + (i + 1) + " is : " + groceryItem[i] +
                    " It's price is " + price[i]);}

            //          1.1 print each items at odd index
        for (int i = 0; i <6 ; i++) {
            if (i%2==1){
                System.out.println(groceryItem[i]+"'s Index is "+i);
            }

        }
            //          1.2 print all items in reverse order
        for (int i = 5; i >=0 ; i--) {
            System.out.println(groceryItem[i]);
        }
            //          1.3 find out the index location of strawberry
        String[] groceryItem1 = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        int strawberryIndex =0;
        for (int i = 0; i <6 ; i++) {
            if (groceryItem1[i].equals("strawberry")){
                strawberryIndex=i;
            }
            
        }
        System.out.println("strawberryIndex = " + strawberryIndex);
            //          1.4 find out the count of groceries that contains berry in thename
        int count =0;
        String list ="";
        for (int i = 0; i <6 ; i++) {
            list += groceryItem[i];

        }
        for (int i = 0; i <list.length()-5 ; i++) {
            if (list.substring(i,i+5).equals("berry")){
                count++;
            }
        }
        System.out.println("Berry count is "+count);

        //          1.5 print out all the character counts of the grocery items
            //
        String list1 ="";
        for (int i = 0; i <6 ; i++) {
            list1 += groceryItem[i];
        }
        for (int i = 0; i <list1.length() ; i++) {
            System.out.print(list.charAt(i)+" ");
        }
        System.out.println();
            //1     .6 print out only those items with even character count
        int count1 =0;
        for (int i = 0; i < 6; i++) {
            if(groceryItem[i].length()%2==0){
                count1++;
            }
        }
        System.out.println("The items with even character count is "+ count1);

            //          1.7 print out only those items end with letter e
        for (int i = 0; i <6; i++) {
            if (groceryItem[i].charAt(groceryItem[i].length()-1)=='e'){
                System.out.println(groceryItem[i]);
            }
        }
            //          1.8 print out only last 3 characters of all the items
        for (int i = 0; i < 6; i++) {
            int startIndex = groceryItem[i].length()-3;
            System.out.println("All the last characters is "+groceryItem[i].substring(+startIndex));
            }

            //          1.9 create String variable called allItems and store all the items inside array
        //          separated by comma.
        String allItems = " ";
        for (int i = 0; i <6 ; i++) {
         allItems+=  groceryItem[i]+",";
        }
        System.out.print("AllItems string is"+allItems+"\t");
        System.out.println();
            //2, loop through each prices  and print them in one line
        for (int i = 0; i <6 ; i++) {
            System.out.print(price[i]+" ");
        }
        System.out.println();
            //            2.1 print each prices in even index
        for (int i = 0; i <6 ; i++) {
            if (i%2==0){
                System.out.println("The index "+i +" is even Index. Its price is "+price[i]);
            }
        }
            //            2.2 print only prices less that 3 dollars
        for (int i = 0; i < 6; i++) {
            if (price[i]<3){
                System.out.println("The prices less than 3 $ is"+price[i]);
            }
        }
            //            2.3 print the sum of all the prices and get average
        double sum =0;
        double average =0;
        for (int i = 0; i < 6; i++) {
            sum+=price[i];
        }
        average = sum/6;
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+ average);
        for (int i = 0; i <6 ; i++) {
            if (price[i]>average){
                System.out.println(price[i]);
            }
        }

            //            2.4 print only prices more than average price
            //            2.5 print the sum of all the prices and get average
            //            2.6 print only prices more than average price
            //            2.7 find out max price and print out max price and  index of max price
        double maxPrice = price[0];
        int maxIndex = 0;
        for (int i = 0; i <6 ; i++) {
            if (price[i]>maxPrice){
                maxPrice=price[i];
                maxIndex=i;
            }
        }
        System.out.println("The Index of MaxPrice is "+maxIndex+" the max number is "+maxPrice);

        
            //            2.8 find out the minimum price and index of minimum price
        double minPrice = price[0];
        int minIndex =0;
        for (int i = 0; i < 6; i++) {
            if (price[i]<minPrice){
                minPrice=price[i];
                minIndex=i;
            }
        }
        System.out.println("The Index of MinPrice is "+minIndex+" the max number is "+minPrice);
            //            2.9 find out second max price and index
        Arrays.sort(price);
        int SecondMaxPriceIndex = price.length-2;
        System.out.println("The second max price is "+price[SecondMaxPriceIndex]);

            //3, assume that the order of grocery Items match the prices in same order do below:
            //            3.1 print first item and first price in one print statement
        //            -->>  apple price is 1.99
            //            3.2 print last item and last price in one print statement
        //            -->>  kiwi price is 2.88
        for (int i = 0; i <6; i++) {
            System.out.println(groceryItem[0]+" price is "+price[0]);
            System.out.println(groceryItem[5]+" price is "+price[5]);

            //            3.2 print all items and prices in one for loop together
            System.out.println(groceryItem[i]+" price is "+price[i]);
        }
            //            3.3 print only those items with price more than 3.11
            //            3.4 print only those items with price more than average
            //            3.5 print only those prices of grocery items that contains letter b
            //            3.6 print the item name with max price
            //            3.7 print the item name with min price
            //4 , Below tasks will modify array :  (for each loop should not be used, try and see why)
            //           4.1 swap the value of first item in array with last item of array , swap apple with kiwi
        String[] groceryItem2 = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        String translation = " ";
        translation =(groceryItem2[0]);

        groceryItem2[0] = (groceryItem2[5]);
        groceryItem2[5] = (translation);
        System.out.println(translation);
        System.out.println("I changed the first APPLE to "+groceryItem2[0]);
        System.out.println("I changed the last KIWI to "+groceryItem2[5]);
            //           4.2 use for loop to loop through your groceryItems array and modify your items like this :                        itemValue+itemCharacterCount
            //      For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
            //           4.3 increase the value of each prices by one  in prices array
            //           4.4 double the value of each prices in your array 1.99-->> 1.99*2
            //           4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
            //           4.6 now find out highest price after the modification
            //           4.7 find out the most expensive item name. (edited)



    }
}

