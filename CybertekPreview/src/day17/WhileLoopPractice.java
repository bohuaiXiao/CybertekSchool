package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //Count 1 to 5 then 5 to 1 in  One line
        int x=1;
        while(x<=4){
            System.out.print(x+",");
            x++;
        }
        System.out.print(x+".");
        System.out.println();

        int y=5;
        while(y>1){
            System.out.print(y+",");
            y--;
        }
        System.out.print(y+".");



    }
}
