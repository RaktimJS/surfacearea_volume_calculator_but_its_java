import java.util.Scanner;

public class sav {
    public static void cls() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
    }

    public static void main(String[] args) throws Exception{
        cls();

        System.out.println("Select a shape from the list below :::");
        System.out.println("    1. Cube");
        System.out.println("    2. Cuboid");
        System.out.println("    3. Cylinder");
        System.out.println("    4. Sphere");
        System.out.println("    5. Cone");

        Scanner scObj = new Scanner(System.in);
        int selector;

        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                selector = scObj.nextInt();

                if (selector >= 1 && selector <= 5){
                    break;
                } else {
                    System.err.println("Out of range input. Try again\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input");
                scObj.nextLine();
            }
        }

        if (selector == 1) {

        } else if (selector == 2) {

        } else if (selector == 2) {

        } else if (selector == 2) {

        } else {

        }

        scObj.close();
    }
}
