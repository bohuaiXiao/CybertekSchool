package day24;

public class repl123 {
    public static void main(String[] args) {

        int treeSize=1;
        int growth =1;
        for (int years = 1; years <=10 ; years++) {
            if (years<=3){
                treeSize=years;
                growth=1;
                System.out.println("year "+years+" - "+"growth "+growth+" cm");
                System.out.println("tree size: "+treeSize+"cm");
            }else {
                growth =2;
                treeSize+=2;
                System.out.println("year "+years+" - "+"growth "+growth+" cm");
                System.out.println("tree size: "+treeSize+"cm");

            }
        }



    }
}
