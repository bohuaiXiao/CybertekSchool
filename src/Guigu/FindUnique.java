package Guigu;

public class FindUnique {
    public static void main(String[] args) {
        int[] numbs = {1,1,2,2,3,3,4,5,5};
        int startIndex=0;
        int endIndex =numbs.length-1;
        while(startIndex<=endIndex){
            int midIndex = (startIndex+endIndex)/2;

            for (int i = 0,count=0 ; i < midIndex; i++) {
                for (int j = 0; j <midIndex ; j++) {
                    if (numbs[i]==numbs[j]){
                        count++;
                }

                }
            }





        }





    }
}
