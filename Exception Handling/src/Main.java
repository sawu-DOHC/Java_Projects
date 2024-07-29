import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main( String[] args ) {

        fileNotFoundException_example();
        numberFormatException_example();
        inputMismatchException_example();
        arithmeticException_example();
        indexOutOfBoundsException_example();
    }
    public static void fileNotFoundException_example() {

        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt"); // attempting to open a non existent file
        }
        catch ( FileNotFoundException fnfe ) {
            System.out.println("File Not Found Exception is being triggered. " + fnfe.getMessage());
        }
    }

    public static void numberFormatException_example() {

        Scanner input = new Scanner( System.in );
        boolean validatedInput = false;
        double number = 0;

        System.out.println("Enter a number.");

        while (validatedInput == false) {
            try {
                String userInput = input.next();  // read user input as a string
                number = Double.parseDouble( userInput );  // attempt to convert the input to a double throws a NFE
                validatedInput = true;
            }
            catch (NumberFormatException nfe) {
                System.out.println("Number Format Exception is being triggered. " + nfe.getMessage());
                System.out.println("Enter a valid number.");
            }
        }
        System.out.println("Validated number: " + number);
    }

    public static void inputMismatchException_example() {

        Scanner input = new Scanner( System.in );
        int age = 0;
        boolean validatedInput = false;
        System.out.println( "Please enter your age." );

        while ( validatedInput == false ) {
            try {
                age = input.nextInt();  // expecting an integer input, catching InputMismatchException
                validatedInput = true;
            }
            catch ( InputMismatchException ime ) {
                System.out.println( "Please enter numbers only." );
                input.next(); //required to clear the scanner object
            }
        }
        System.out.println( "Validated age: " + age );
    }





    public static void arithmeticException_example() {

        try {
            int result = 2/0;  // this will throw ArithmeticException
        }
        catch ( ArithmeticException ae ) {
            System.out.println( "Cannot divide by zero: " + ae.getMessage() );
        }
    }

    public static void indexOutOfBoundsException_example() {

        try {
            int[] numbers = { 1, 2, 3 };
            int number = numbers[ 5 ];  // attempting to access an index that is out of bounds
        }
        catch ( IndexOutOfBoundsException iobe ) {
            System.out.println( "Index out of bounds: " + iobe.getMessage() );
        }
    }




}
