package day20;

public class loopString {
    public static void main(String[] args) {
                    //0123456789012345678
        String word ="xdefxjavaxggjavaxx";
                    //123456789012345678
        int indexOfLast =word.length()-1;
        int counter = 0;
        for(int i = 0; i<indexOfLast-3; ++i){
            String wordjava =word.substring(i,i+5);
            System.out.println(wordjava);
            if (wordjava.equals("javax")){
                System.out.println("yes!!!");
                ++counter;
            }

            }
            System.out.println(counter);
    }
}
