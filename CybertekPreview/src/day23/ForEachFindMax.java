package day23;

public class ForEachFindMax {
    public static void main(String[] args) {
        long []salaries ={10000,3123,31231425,6543423,934858348,9887};
        long max =0;
        long min =0;
        for (long eachSalary :salaries){
            System.out.println("Each Salary = " + eachSalary);
            if (eachSalary>max){
                max=eachSalary;
            }
            min =salaries[0];
            if (eachSalary<min){
                min =eachSalary;
            }
        }

        System.out.println("Min is "+min  );
        System.out.println("Max is "+max);


    }
}
