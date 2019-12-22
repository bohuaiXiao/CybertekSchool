package day17;

import java.util.Scanner;

public class repl_78 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int endPoint = txt.length()-1;
        System.out.println(txt.substring(0,endPoint));
    }
}
