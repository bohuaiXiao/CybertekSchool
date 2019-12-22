package Guigu;

import java.util.Scanner;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many students ?");
        int studentCount = scanner.nextInt();// get the length of the array
        //enter 5 score
        int [] score = new int[studentCount];
        int highestScore = 0;
        for (int i = 0; i <studentCount ; i++) {
            System.out.println("Please enter the score!!!");
            score[i] = scanner.nextInt();
            // get the highest score
            if (highestScore<score[i]){
                highestScore=score[i];
            }
        }
        System.out.println("In the class the highest score is "+highestScore);
            // use if get the level
        for (int i = 0; i <studentCount ; i++) {


            if (score[i]>=highestScore-10){
                System.out.println("You are in Level-A"+"Your score is "
                +score[i]);
            }else if (score[i]>=highestScore-20){
                System.out.println("You are in Level-B"+"Your score is "
                +score[i]);
            }else if (score[i]>=highestScore-30){
                System.out.println("You are in Level-C"+"Your score is "
                +score[i]);
            }else{
                System.out.println("Your score is "+score[i]+" Please study hard!!!");
            }
        }
    }
}
