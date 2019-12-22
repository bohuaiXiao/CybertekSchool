package day24;

import java.util.Scanner;

public class repl119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

// justin19900218@gmail.com
        // find the @ location; find the . location
        // if @ count ==1 ok; else invail email
        int atLocation = email.indexOf('@',0);
        int atCount = 0;
        String emailId = "";
        String emailDomain = "";
        for (int i = 0; i <email.length() ; i++) {
            if (email.charAt(i)=='@'){
                atCount++;
            }
        }
        if (atCount==1){
emailId+=email.substring(0,atLocation);
emailDomain+=email.substring(atLocation+1);
            System.out.println("Email id: "+emailId);
            System.out.println("Email domain: "+emailDomain);
        }else {
            System.out.println("Invalid email");
        }

    }
}
