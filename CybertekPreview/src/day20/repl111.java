package day20;

public class repl111 {
    public static void main(String[] args) {
        //1*1+2*2+3*3........... do while
        int k = 1;
        int total = 0;
        int numberPlu =0;
        do {
            numberPlu = k*k;
            total+=numberPlu;
            k++;
        }while(k<=50);
        System.out.println(total);




    }
}
