package day17;

import java.util.Scanner;

public class repl_72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        //If email has contains underscore -
        if(email.contains("_")){
            int underscoreIndex = email.indexOf("_");// get _ index
            int atIndex = email.indexOf("@");// get@ index
            String firstName = email.substring(0,underscoreIndex);// first name from0-->"_"
            String lastName = email.substring(underscoreIndex+1,atIndex);//last name from after"_"-->@
            String afterAtPoint = email.substring(atIndex);// get after@
            System.out.println(lastName+"_"+firstName+afterAtPoint);
        }else{// if email does't have _----->print email, no need  change.
            System.out.println(email);
        }
    }
}
