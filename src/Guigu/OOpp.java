package Guigu;

public class OOpp {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age =29;
        p1.isMale = true;
        p1.eat("Pizza");
        p1.sleep();
        p1.talk("chinese");
        System.out.println(p1.name);

    }
    static class Person{
       // field
       String name;
        int age;
        boolean isMale;
        //method
        public void sleep(){
            System.out.println("Sleep");
        }
        public void eat(String food){
            System.out.println("Eat"+food);
        }
        public void talk(String language){
            System.out.println("I can speak "+language);
        }




    }
}
