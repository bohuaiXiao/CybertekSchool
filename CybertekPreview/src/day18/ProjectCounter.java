package day18;

public class ProjectCounter {
    public static void main(String[] args) {
        //               1234567890123456789
        String srcText= "cat-dog-cat-dog-cat";
//                       0123456789012345678
//                       cat
        int count =0;
        int index =0;
        while((index= srcText.indexOf("cat",index))!=-1){
            System.out.println("cat".length());
            index=index+"cat".length();
            count++;

    }
        System.out.println(count);
    }
}
