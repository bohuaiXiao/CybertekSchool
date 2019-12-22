package day17;

import java.util.Scanner;

public class repl_71 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        // if a contain " name && subject" -->read
        if(a.contains("subject")&&a.contains("alejandro")){
            System.out.println("read this mail");
        }else if(a.contains("project")&&a.contains("alejandro")){
            System.out.println("read this mail");
        }
        else{
            System.out.println("dont read");
        }
        //else --> dont read

    }
}
