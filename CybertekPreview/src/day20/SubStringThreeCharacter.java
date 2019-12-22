package day20;

public class SubStringThreeCharacter {
    public static void main(String[] args) {
        String name ="ayra";
        int lastIndex = name.length()-1;
        for (int i = 0; i <=lastIndex-2 ; i++) {// need to get each character

            System.out.println(i+":"+name.substring(i,i+3));
        }



    }
}
