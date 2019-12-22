package day17;

public class WakeUp2 {
    public static void main(String[] args) {
        String fullName = "adAEaf eFsf";
        String firstName = fullName.substring(0,5);
        String lastName = fullName.substring(7);
        String fixedFirstName = firstName.substring(0,1).toUpperCase();
        fixedFirstName+=firstName.substring(1).toLowerCase();
        System.out.println(fixedFirstName);

        String fixedLastName = lastName.substring(0,1).toUpperCase();
        fixedLastName+=lastName.substring(1).toLowerCase();
        System.out.println(fixedLastName);

        String fixedFullName = fixedFirstName+" "+fixedLastName;
        System.out.println(fixedFullName);


    }
}
