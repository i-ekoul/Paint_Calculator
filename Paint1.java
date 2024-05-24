import java.util.Scanner;

class Paint1 {

    private static Scanner scnr;

	public static void main(String[] args) {
        scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea;
        double gallonsPaintNeeded;
    
        final double squareFeetPerGallons = 350.0;
    
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
            try {
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0) {
                    throw new IllegalArgumentException("Height must be greater than zero.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.nextLine(); // Clear the invalid input from the buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (wallHeight <= 0);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            System.out.println("Enter wall width (feet): ");
            try {
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0) {
                    throw new IllegalArgumentException("Width must be greater than zero.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.nextLine(); // Clear the invalid input from the buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (wallWidth <= 0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }
}
