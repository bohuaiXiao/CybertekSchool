package day23;

public class ArrayFromMinToMax {
    public static void main(String[] args) {
        int [] arr = {5,4,1,6,3};
        int translation =0;
        //0号角标数字2 和1 号角标 4 对比；
        if (arr[0]>arr[1]){
            //如果 第一个大于第二个，那么就更换index
            arr[0]=translation;
            translation=arr[1];
            arr[1]=arr[0];

        }
        System.out.println(arr[0]);



    }
}
