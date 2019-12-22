package day18;

import java.util.Scanner;

public class repl86_$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        String yesOrNo =" ";
        String nameList = "";

        do {
            System.out.println("Please enter guest name:");
            name = scanner.nextLine();
            System.out.println("Do you want to enter new guest name:");
            yesOrNo = scanner.nextLine();
            nameList += name+", ";

        }while (!yesOrNo.equals("no"));
         nameList = nameList.substring(0,nameList.length()-2);

        System.out.println(nameList);
    }
}
