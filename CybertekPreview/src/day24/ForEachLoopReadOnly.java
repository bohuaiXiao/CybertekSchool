package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int myfavNumber = 300;
        int youFavNumber = myfavNumber;
        long [] nums = {10,20,30};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int i = 0; i <3 ; i++) {
            nums[i] = nums[i]*2;
            System.out.println(nums[i]);
        }
        for(long eachNum:nums){
            System.out.println(eachNum+"before");
            eachNum=200;
            System.out.println("After "+eachNum);
        }
        System.out.println("New nums is "+nums[0]);




    }
}
