package day20;

public class PalindromeTest {
    // if you reverse a String if it does not change
    // it means the string is palindrome
    public static void word(String word, char sep, int rep)
    {
        if (rep == 1)
        {

        }
        else if (rep%2 == 0)
        {
            for (int i = 1; i < rep; i++)
            {
                System.out.print(word + sep);
            }
//            System.out.print(word);
        }
        else if (rep%2 != 0)
        {
            for (int i = 1; i < rep; i ++)
            {
                System.out.print(word + sep);
            }
        }
        System.out.print(word);
    }
    public static void main(String[] args) {

//        String name = "Nurese run";
//        String reversname = "";
//        for (int i = name.length()-1;i>=0 ; i--) {
//            reversname += name.charAt(i);
//        }
//        System.out.println("reversed name is   :"+reversname);
//      reversname= reversname.replace(" ","");
//      name = name.replace(" ","");
//
//        // Nurese run ----> make does not care about the spaces
//        System.out.println(reversname);
//        System.out.println(name.equalsIgnoreCase(reversname));
//
//

        word("word", 'x', 6);
    }
}
