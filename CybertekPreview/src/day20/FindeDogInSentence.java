package day20;

public class FindeDogInSentence {
    public static void main(String[] args) {
        String sentence = "I like dog,cat-dod doog,dog";
        int count = 0;
        // find out the location of the dog;
        // our approach is
        // doing through the sentence 3 character to be a dog, we print out the index
        int lastCharIndex = sentence.length()-1;
        for (int i = 0; i <lastCharIndex-2 ; i++) {
            String curren3char = sentence.substring(i,i+3);
            System.out.println(i+" :"+curren3char);
            if (curren3char.equals("dog")){
                count++;
            }
            System.out.println("Count:"+count);
        }
    }
}
