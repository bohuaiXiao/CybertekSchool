package Task;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //Task 5:
        //given a name with prefix, stored in a String variable called name
        Scanner scan = new Scanner(System.in);

        System.out.println("Pleas enter a name with prefix!");
        //for example
         String name = scan.nextLine();
        //    Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
        //-- in case insensitive condition ----
        //print as below
        if(name.startsWith("Dr")){
            System.out.println("Doctor");
        }else if(name.startsWith("Mr")){
            System.out.println("Male");
        }
        //if the name Started with (Dr )-->> Doctor
        //if the name Started with (Mr )-->> Male
        //if the name Started with (Miss )-->> Single female
        else if (name.startsWith("Miss")){
            System.out.println("Single female");
        }else if(name.startsWith("Mrs")){
            System.out.println("Married female");
        }
        //if the name Started with (Mrs )-->> Married female
        //


    }
}
