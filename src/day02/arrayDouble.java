package day02;

public class arrayDouble {
    public static void main(String[] args) {
        // normal array
        int [] arrayOne =new int []{1,2,3,4};
        // Double array
        int [][] arrayTwo = new int[][]{{1,2,3},{34,55,76},{90,87,80}};
        String[][] arrayThree = new String[2][3];
        // 动态二维数组的解释：从左向右--->【2】一个有两个元素的一维数组；---->每个数组里
        //中都有一个有三个元素组成的一维数组。
        //二维数组的遍历
        int [][] arrayFour = new int[][]{{2,3,5},{33,23,11,45},{109,88,34,59,83}};
        for (int i = 0; i <arrayFour.length ; i++) {
            for (int j = 0; j <arrayFour[i].length ; j++) {
                System.out.print(arrayFour[i][j]+",");
            }
            System.out.println();


        }


    }
}
