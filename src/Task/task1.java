package Task;

public class task1 {
    public static void main(String[] args) {
        //Task 1:
        //Given a String with any possible length including 0
        //print first 2 characters only if the String has more than 1 character
        //if the String is empty print Empty String
        //else print the first char twice in same Link
        //    for example :
        //        "abcde" --> ab
        //        ""        --> empty String
        //        "J"       --> JJ
        String character = "abcde";
        if(character.length()>1){
            System.out.print(character.charAt(0));
            System.out.print(character.charAt(1));
        }else if(character.length()==0){
            System.out.println("empty String");
        }else{
            System.out.print(character.charAt(0));
            System.out.print(character.charAt(0));
        }
    }
}
