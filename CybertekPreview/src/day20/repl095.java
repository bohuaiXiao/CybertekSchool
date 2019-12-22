package day20;

public class repl095 {
    public static void main(String[] args) {
        String word = "word";
        String sep = "x";
        String finnal = " ";
        int times = 3;
        for (int i = 1; i <=times    ; i++) {
            finnal=word+sep;
            int lastIndex = word.length();
            finnal = finnal.substring(0,lastIndex);
            System.out.print(finnal);
        }


    }
}
