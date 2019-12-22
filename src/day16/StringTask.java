package day16;

public class StringTask {
    public static void main(String[] args) {
        //Task 1 :
        //Name checker :
        //Declare a variable to store your name
        String name = "Bohuai Xiao";
        //check whether you name length is less than 4
        int nameLength = name.length();
        //  if so print short Name
        if(nameLength<=4){
            System.out.println("short name.");
        }
        //  if it is within 5-10
        else if(nameLength<=10&&nameLength>=5){
            System.out.println("medium name");
        }
        //	if so print medium Name
        else if(nameLength>=11){
            System.out.println("longer name");
        }
        //	if it's more than 11
        //	print longer name
        //------------------------------
        //check whether your name has either character a or e
        if(name.contains("a")||name.contains("e")){
            System.out.println("name contains a or e");
        }
        // if so -->> name contains a or e
        else{
            System.out.println("I don't have both a or e in my name");
        }
        // if not -->> i dont have both a or e in my name



    }
}
