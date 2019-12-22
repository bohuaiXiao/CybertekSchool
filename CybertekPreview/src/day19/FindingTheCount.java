package day19;

public class FindingTheCount {
    public static void main(String[] args) {
        int count =0;
        for(int x=1;x<=100;x++){
            if (x%15==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
