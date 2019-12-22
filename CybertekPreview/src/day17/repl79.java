package day17;

import java.util.Scanner;

public class repl79 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        //get txt length
        int txtLength = txt.length();
        int lastIndex = txtLength-1;
        System.out.println(txt.substring(0,lastIndex));
        System.out.println(txt.substring(0,2));



    }
}
