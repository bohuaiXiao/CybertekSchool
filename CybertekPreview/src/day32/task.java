package day32;

public class task {
    public static void main(String[] args) {
        String name = "BohuaiXiao";
        String firstName ="Bohuai";
        String lastName ="Xiao";
char beginning ='D';
char ending = 'A';

//reversePrintAnyName(name);
//printLastCharacterOfName(name);
//printFullNameInformation(firstName,lastName);
//printAtoZ();
printAlphabetInRange(beginning,ending);
    }
        /*
        Create below static void methods :
and call them in main method to test.
reversePrintMyOwnName
* create a method that has no parameter
	and print your name in reversed order
reversePrintAnyName

create a method that has 1 String parameter called name
	and print that name in reversed order
*/
        public static void reversePrintAnyName(String name){
            for (int i = name.length()-1; i>=0; i--) {
                System.out.print(name.charAt(i)+" ");
            }
            System.out.println();
        }

public static void printLastCharacterOfName(String name ){
    System.out.println(name.charAt(name.length()-1));
    System.out.println();
}
/* create a method that has 1 String parameter called name
	and print last character of that name
	*/


/*printFullNameInformation
* create a method that has 2 String parameter called firstName,lastName
	and print "Your first name is firstName , Your last Name is lastName
		print " your full name lenth is lengthOfTheFullName"
		* */
public static void printFullNameInformation (String firstName,String lastName){
    System.out.println("Your first name is "+firstName+" , Your last Name is "+lastName);
    String fullName = firstName+lastName;
    int lengthOfTheFullName = fullName.length();
    System.out.println(" your full name length is "+lengthOfTheFullName);
}
/*compareNameCharacterCount
* create a method that has 2 String parameter called name1,name2
	if name 1 has more characters
		 print " name 1 is longer "
	if name 2 has more characters
		 print " name 2 is longer "
	if name 2 has same character count
		 print " name 1 and name 2 same character count "*/
public static void compareNameCharacterCount(String name1,String name2  ){
    int name1Length = name1.length();
    int name2Length = name2.length();
    if (name1Length>name2Length){
        System.out.println(" name 1 is longer ");
    }else if (name1Length<name2Length){
        System.out.println(" name 2 is longer ");
    }else {
        System.out.println(" name 1 and name 2 same character count ");
    }

}


/*printAtoZ
* create a method that has no parameter
	and print A-Z in one line
printZtoA
*/
public static void  printAtoZ(){
    for (char i = 'A'; i <='Z' ; i++) {
        System.out.print(i);
    }
    System.out.println();
}
public static  void printZtoA(){
    for (char  i = 'Z'; i >='A' ; i--) {
        System.out.print(i);
    }
    System.out.println();
}

/*create a method that has no parameter
	and print Z-A in one line
printAlphabetInRange
* create a method that have 2 char as parameters: beginning, ending
if beginning character is before ending character
	for example beginning A , ending D  -->> ABCD
if beginning character is after ending character
	for example beginning D , ending A  -->> DCBA
         */

public static void printAlphabetInRange(char beginning, char ending){
    if (beginning<ending){
        for(char x = beginning;x<=ending;x++){
            System.out.print(x);
        }
    }else if (beginning>ending){
        for (char i = beginning; i >=ending ; i--) {
            System.out.print(i);
        }
    }
}
    }

