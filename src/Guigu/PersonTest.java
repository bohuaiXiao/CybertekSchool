package Guigu;

public class PersonTest {
    public static void main(String[] args) {
        PersonClass p1 = new PersonClass();
        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;
        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(newAge);

    }
}
