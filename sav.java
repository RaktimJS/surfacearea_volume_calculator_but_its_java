import java.util.Scanner;

public class sav {
    public static void cls() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
    }

    public static void main(String[] args) throws Exception{
        cls();

        System.out.println("Select a shape from the list below :::");
        System.out.println("  1. Cube");
        System.out.println("  2. Cuboid");
        System.out.println("  3. Cylinder");
        System.out.println("  4. Sphere");
        System.out.println("  5. Cone");

        Scanner scObj = new Scanner(System.in);
        byte selector;

        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                selector = scObj.nextByte();

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
            cube();
        } else if (selector == 2) {
            cuboid();
        } else if (selector == 3) {
            cylinder();
        } else if (selector == 4) {
            sphere();
        } else {
            cone();
        }

        scObj.close();
    }


    // Functions to calculate different metrics for the 5 shapes

    // CUBE
    public static void cube() {
        Scanner scObj = new Scanner(System.in);
        byte paramSelector;

        System.out.println("\n===== CUBE =====");

        System.out.println("Select a metric to calculate from the list below :::");
        System.out.println("  1. Total Surface Area");
        System.out.println("  2. Curved Surface Area");
        System.out.println("  3. Volume");

        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                paramSelector = scObj.nextByte();

                if (paramSelector >= 1 && paramSelector <= 3){
                    break;
                } else {
                    System.err.println("  Out of range input. Try again\n");
                }
            } catch (Exception e) {
                System.out.println("  Invalid Input");
                scObj.nextLine();
            }
        }

        if (paramSelector == 1) {
            cubeTSA();
        } else if (paramSelector == 2) {
            cubeCSA();
        } else {
            cubeVol();
        }

        scObj.close();
    }

    public static void cubeTSA() {
        Scanner scObj = new Scanner(System.in);
        float side;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            System.out.print("Enter the side of the cube ::: ");
            
            try {
                side = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Total Surface Area ::: %.2f", 6*side*side);
    }
    
    public static void cubeCSA() {
        Scanner scObj = new Scanner(System.in);
        float side;

        System.err.println("\n--- CURVED SURFACE AREA ---");
        while (true) {
            System.out.print("Enter the side of the cube ::: ");
            
            try {
                side = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Curved Surface Area ::: %.2f", 4*side*side);
    }
    
    public static void cubeVol() {
        Scanner scObj = new Scanner(System.in);
        float side;

        System.err.println("\n--- VOLUME ---");
        while (true) {
            System.out.print("Enter the side of the cube ::: ");
            
            try {
                side = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Volume ::: %.2f", side*side*side);
    }




    // CUBOID
    public static void cuboid() {
        Scanner scObj = new Scanner(System.in);
        byte paramSelector;

        System.out.println("\n===== CUBOID =====");

        System.out.println("Select a metric to calculate from the list below :::");
        System.out.println("  1. Total Surface Area");
        System.out.println("  2. Curved Surface Area");
        System.out.println("  3. Volume");

        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                paramSelector = scObj.nextByte();

                if (paramSelector >= 1 && paramSelector <= 3){
                    break;
                } else {
                    System.err.println("  Out of range input. Try again\n");
                }
            } catch (Exception e) {
                System.out.println("  Invalid Input");
                scObj.nextLine();
            }
        }

        if (paramSelector == 1) {
            cuboidTSA();
        } else if (paramSelector == 2) {
            cuboidCSA();
        } else {
            cuboidVol();
        }

        scObj.close();
    }

    public static void cuboidTSA() {
        Scanner scObj = new Scanner(System.in);
        float length, breadth, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the length of the cuboid ::: ");
                length = scObj.nextFloat();

                System.out.print("Enter the breadth of the cuboid ::: ");
                breadth = scObj.nextFloat();

                System.out.print("Enter the height of the cuboid ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Total Surface Area ::: %.2f", 2*(length*height + breadth*height + length*breadth));
    }
    
    public static void cuboidCSA() {
        Scanner scObj = new Scanner(System.in);
        float length, breadth, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the length of the cuboid ::: ");
                length = scObj.nextFloat();

                System.out.print("Enter the breadth of the cuboid ::: ");
                breadth = scObj.nextFloat();

                System.out.print("Enter the height of the cuboid ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Curved Surface Area ::: %.2f", 2*(length*height + breadth*height));
    }

    public static void cuboidVol() {
        Scanner scObj = new Scanner(System.in);
        float length, breadth, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the length of the cuboid ::: ");
                length = scObj.nextFloat();

                System.out.print("Enter the breadth of the cuboid ::: ");
                breadth = scObj.nextFloat();

                System.out.print("Enter the height of the cuboid ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Volume ::: %.2f", length*breadth*height);
    }




    // CYLINDER
    public static void cylinder() {
        Scanner scObj = new Scanner(System.in);
        byte paramSelector;

        System.out.println("\n===== CYLINDER =====");

        System.out.println("Select a metric to calculate from the list below :::");
        System.out.println("  1. Total Surface Area");
        System.out.println("  2. Curved Surface Area");
        System.out.println("  3. Volume");

        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                paramSelector = scObj.nextByte();

                if (paramSelector >= 1 && paramSelector <= 3){
                    break;
                } else {
                    System.err.println("  Out of range input. Try again\n");
                }
            } catch (Exception e) {
                System.out.println("  Invalid Input");
                scObj.nextLine();
            }
        }

        if (paramSelector == 1) {
            cylinderTSA();
        } else if (paramSelector == 2) {
            cylinderCSA();
        } else {
            cylinderVol();
        }

        scObj.close();
    }

    public static void cylinderTSA() {
        Scanner scObj = new Scanner(System.in);
        float radius, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the cylinder ::: ");
                radius = scObj.nextFloat();

                System.out.print("Enter the height of the cylinder ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Total Surface Area ::: %.2f", 2*3.14*radius*(radius+height));
    }
    
    public static void cylinderCSA() {
        Scanner scObj = new Scanner(System.in);
        float radius, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the cylinder ::: ");
                radius = scObj.nextFloat();

                System.out.print("Enter the height of the cylinder ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Curved Surface Area ::: %.2f", 2*3.14*radius*height);
    }

    public static void cylinderVol() {
        Scanner scObj = new Scanner(System.in);
        float radius, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the cylinder ::: ");
                radius = scObj.nextFloat();

                System.out.print("Enter the height of the cylinder ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Total Surface Area ::: %.2f", 3.14*radius*radius*height);
    }
    
    
    
    // SPHERE
    public static void sphere() {
        Scanner scObj = new Scanner(System.in);
        byte paramSelector;
    
        System.out.println("\n===== SPHERE =====");
    
        System.out.println("Select a metric to calculate from the list below :::");
        System.out.println("  1. Total Surface Area");
        System.out.println("  2. Curved Surface Area");
        System.out.println("  3. Volume");
    
        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                paramSelector = scObj.nextByte();
    
                if (paramSelector >= 1 && paramSelector <= 2){
                    break;
                } else {
                    System.err.println("  Out of range input. Try again\n");
                }
            } catch (Exception e) {
                System.out.println("  Invalid Input");
                scObj.nextLine();
            }
        }
    
        if (paramSelector == 1) {
            sphereSA();
        } else {
            sphereVol();
        }
    
        scObj.close();
    }
    
    public static void sphereSA() {
        Scanner scObj = new Scanner(System.in);
        float radius;
    
        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the sphere ::: ");
                radius = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }
    
        scObj.close();
    
        System.err.printf("Surface Area ::: %.2f", 4*3.14*radius*radius);
    }
    
    public static void sphereVol() {
        Scanner scObj = new Scanner(System.in);
        float radius;
    
        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the sphere ::: ");
                radius = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }
    
        scObj.close();
    
        System.err.printf("Total Surface Area ::: %.2f", (4/3)*3.14*radius*radius*radius);
    }




    // CONE
    public static void cone() {
        Scanner scObj = new Scanner(System.in);
        byte paramSelector;

        System.out.println("\n===== CONE =====");

        System.out.println("Select a metric to calculate from the list below :::");
        System.out.println("  1. Total Surface Area");
        System.out.println("  2. Curved Surface Area");
        System.out.println("  3. Volume");

        while (true) {
            System.out.print("\nEnter your choice from the above list ::: ");
            
            try {
                paramSelector = scObj.nextByte();

                if (paramSelector >= 1 && paramSelector <= 3){
                    break;
                } else {
                    System.err.println("  Out of range input. Try again\n");
                }
            } catch (Exception e) {
                System.out.println("  Invalid Input");
                scObj.nextLine();
            }
        }

        if (paramSelector == 1) {
            coneTSA();
        } else if (paramSelector == 2) {
            coneCSA();
        } else {
            coneVol();
        }

        scObj.close();
    }

    public static void coneTSA() {
        Scanner scObj = new Scanner(System.in);
        float radius, height, slantHeight;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the cone ::: ");
                radius = scObj.nextFloat();

                System.out.print("Enter the height of the cone ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        slantHeight = (float) Math.sqrt((radius*radius) + (height*height));

        System.err.printf("Total Surface Area ::: %.2f", 3.14*radius*(radius+slantHeight));
    }
    
    public static void coneCSA() {
        Scanner scObj = new Scanner(System.in);
        float radius, height, slantHeight;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the cone ::: ");
                radius = scObj.nextFloat();

                System.out.print("Enter the height of the cone ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        slantHeight = (float) Math.sqrt((radius*radius) + (height*height));

        System.err.printf("Curved Surface Area ::: %.2f", 3.14*radius*slantHeight);
    }

    public static void coneVol() {
        Scanner scObj = new Scanner(System.in);
        float radius, height;

        System.err.println("\n--- TOTAL SURFACE AREA ---");
        while (true) {
            try {
                System.out.print("Enter the radius of the cone ::: ");
                radius = scObj.nextFloat();

                System.out.print("Enter the height of the cone ::: ");
                height = scObj.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("\t   Invalid Input");
                scObj.nextLine();
            }
        }

        scObj.close();

        System.err.printf("Total Surface Area ::: %.2f", (1/3)*3.14*radius*radius*height);
    }
}
