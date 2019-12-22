package Guigu;

public class PersonClass {

        String name;
        int age;
        int sex;
        public void study(){
            System.out.println("Studying");
        }
        public void showAge(){
            System.out.println("Age is "+age);
        }
        public int addAge(int addAge){
                    age+=addAge;
                    return age;
        }
    }

