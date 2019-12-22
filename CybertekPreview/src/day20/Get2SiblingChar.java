package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        // given a String with even number charater count
        String name = "Ayra";
        int lastIndex = name.length()-1;
        for (int x =0;x<=lastIndex-1;x++){
            System.out.println();
            System.out.println(x+":"+name.substring(x,x+2));
        }





    }
}
