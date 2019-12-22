package day17;

import java.util.Scanner;

public class Repl_74 {
    public static void main(String[] args) {
        //Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        //
        //Variables are already declared:
        //
        //sender, phoneNumber, messageBody
        //- by using String methods:
        //retrieve related information from SMSmessage string and assign to those 3 variables.
        //-print each variable in separate line
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        int leftSignIndex = message.indexOf("<");
        int rightSignIndex = message.indexOf(">");
        int leftBracketIndex = message.indexOf("[");
        int rightBracketIndex = message.indexOf("]");
        int leftBraceIndex = message.indexOf("{");
        int rightBraceIndex = message.indexOf("}");
        String sender = message.substring(leftSignIndex+1,rightSignIndex);
        String phoneNumber =message.substring(leftBracketIndex+1,rightBracketIndex);
        String messageBody = message.substring(leftBraceIndex+1,rightBraceIndex);
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);

    }
}
