package day17;

import java.util.Scanner;

public class Repl_73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        //justin_xiao@gmail.com
        //need to get FirstName;"_";LastName;"@";"."
        int underscoreIndex = email.indexOf("_");
        int atScore = email.indexOf("@");
        int pointIndex = email.indexOf(".");
        String firstName = email.substring(0,1).toUpperCase()+email.substring(1,underscoreIndex);
        String lastName = email.substring(underscoreIndex+1,underscoreIndex+2).toUpperCase()+email.substring(underscoreIndex+2,atScore);
        String domain = email.substring(atScore+1,pointIndex);
        String top_levelDomain = email.substring(pointIndex+1);
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+top_levelDomain);



    }
}
