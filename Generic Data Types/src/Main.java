import java.util.Scanner;

import Classes.GenericObject;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer.");
        GenericObject<Integer> object1 = new GenericObject<>(input.nextInt());

        System.out.println("Please enter a double.");
        GenericObject<Double> object2 = new GenericObject<>(input.nextDouble());

        System.out.println("Please enter a word.");
        GenericObject<String> object3 = new GenericObject<>(input.next());

        // Need to cast to specific types to perform operations
        Integer intValue = object1.generic_datatype;
        Double doubleValue = object2.generic_datatype;
        String stringValue = object3.generic_datatype;

        // Output result
        System.out.println(intValue * doubleValue + " " + stringValue);

        input.close();
    }


}
