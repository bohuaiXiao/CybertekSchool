package Guigu;

public class day1 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for (int i = 0; i <index.length ; i++) {
            tel+=arr[index[i]];
        }//1801320100


    }
}
