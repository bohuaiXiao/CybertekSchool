package Guigu;

public class day03 {
    public static void main(String[] args) {
      // find the location!!!!
        int[] numbs ={1,3,5,6,8,9,11,13,15,19};
        int findTheNumber = 6;

        int startIndex=0;
        int endIndex = numbs.length-1;
        boolean isFlag = true;
        while(startIndex<=endIndex){
            int midIndex =(startIndex+endIndex)/2;
            if (findTheNumber==numbs[midIndex]){
                isFlag = false;
                System.out.println("Yes, You find it!!!"+"The index of your oder is "+
                        midIndex);
                break;
        }else if (findTheNumber<numbs[midIndex]){
            endIndex = midIndex-1;
            }else {
                startIndex=midIndex+1;
            }
        }
        if (isFlag){
            System.out.println("I can't find the number you want!!!");
        }



    }
}
