package day29;

public class ArrayPrectice {
    public static void main(String[] args) {
String name ="SuperMan-Clark Kent";
String [] heroSpilt = name.split("-");
String heroType = heroSpilt[0];
String fullName = heroSpilt[1];
        System.out.println("Hero type "+heroType+"\t"+""+"FullName is "+fullName);
String [] names = fullName.split(" ");
        System.out.println(names[0].charAt(0)+""+names[names.length-1].charAt(0));






    }
}
