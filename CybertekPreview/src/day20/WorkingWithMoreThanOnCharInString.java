package day20;

public class WorkingWithMoreThanOnCharInString {
    public static void main(String[] args) {
        // given a String with even number character count
        // print 2 character in one line
        // ex: Gokyuzum
        String name = "Gokyuzum";
        int charCount = name.length();
        int lastIndex = charCount-1;
        //lastIndex -1
        for(int i=0;i<=lastIndex-1;i+=2){
            System.out.println(name.substring(i,i+2));
            }
        System.out.println(name.substring(6,8));

        }



    }
