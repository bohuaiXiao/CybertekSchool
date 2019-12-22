package day16;

import java.util.Scanner;

public class GoogleSearch {
    public static void main(String[] args) {
        /*
         Create a program to ask user to
         enter a String with any number of word
         Create a variable called searchKeyword to save user input
         Create another String variable called tabTitle
         assign tabTitle value to searchKeyword +  "- Google Search"
         Check if tabTitle start with your searchKeyword
         and end with - Google Search
         If so print the test has passed , if not print test has failed
         (Assume you don't know tab title is already correct
         in real world , we will capture it with automation)
         * */
        Scanner scan = new Scanner(System.in);
        String searchKeyword = scan.nextLine();
        String tabTitle = searchKeyword+ "- Google Search";
        if(tabTitle.startsWith(searchKeyword)&&tabTitle.endsWith("Google Search")){
            System.out.println("The test has passed");
        }else{
            System.out.println("The test has failed");
        }





    }
}
