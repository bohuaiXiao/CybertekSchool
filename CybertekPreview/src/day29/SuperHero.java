package day29;

public class SuperHero {
    public static void main(String[] args) {
       String [] allHero = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};
        for (String eachHero :
                allHero) {
            String hero = eachHero;
            String[] splitHero = hero.split("-");
            String heroType = splitHero[0];
            String fullName = splitHero[1];
            String[] splitFullName = fullName.split(" ");
            String firstName = splitFullName[0];
            String lastName = splitFullName[splitFullName.length - 1];
            String initial = firstName.charAt(0) + "" + lastName.charAt(0);
            String start = "";
            for (int i = 0; i < fullName.length(); i++) {
                start += "*";
            }
            String heroX = hero.replace(fullName, start);
            System.out.println("The hero type is " + heroType);
            System.out.println("The name's initial is " + initial);
            System.out.println("The XXXXXXXX" + heroX);


        }
    }
}
