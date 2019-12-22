package day17;

public class NamePrinter {
    public static void main(String[] args) {
        String name = "Alexander";
        //if you have complain in life call 1-800-Alexander
        // get each and every character and bring them out
        int x = 0;
        // in oder to print to each character of a string
        // we need to start getting character
        // from index 0 till last index(name.length())
        while (x < name.length()) {
            System.out.print("Index is :"+ x+"  ");
            System.out.println(name.charAt(x));
            x++;

        }
    }
}
