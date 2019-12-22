package day16;

public class monkeyTask {
    public static void main(String[] args) {
        //5 little monkeys jumping on the bed,
        //1 fell down and bumped his head,
        //Mama called the doctor and the doctor said,
        //No more monkeys jumping on the bed!
        //4 little monkeys jumping on the bed,
        //1 fell down and bumped his head,
        //Mama called the doctor and the doctor said,
        //No more monkeys jumping on the bed!
        //3 little monkeys jumping on the bed,
        //One fell down and bumped his head,
        //Mama called the doctor and the doctor said,
        //No more monkeys jumping on the bed!
        //2 little monkeys jumping on the bed,
        //One fell down and bumped his head,
        //Mama called the doctor and the doctor said,
        //No more monkeys jumping on the bed!
        //1 little monkey jumping on the bed,
        //One fell down and bumped his head,
        //Mama called the doctor and the doctor said,
        //No more monkeys jumping on the bed!
        //Put those monkeys right to bed!
        //Collapse
        int monkeyNumber =5;// create a loop form 5 to 1
        while(monkeyNumber>0){
            System.out.println(monkeyNumber+" little monkeys jumping on the bed,");
            System.out.println("One fell down and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("No more monkeys jumping on the bed!");
            monkeyNumber--;
        }// finish the loop --> no more monkey
        System.out.println("Put those monkeys right to bed!");


    }
}
