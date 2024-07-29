package Classes;

public class SearchAlgorithms{

    public static int SequentialSearch( int[] array, int value ) {
        int index;        // Loop control variable
        int element;      // Element the value is found at
        boolean found;    // Flag indicating search results

        // Element 0 is the starting point of the search.
        index = 0;

        // Store the default values element and found.
        element = -1;
        found = false;

        // Search the array.
        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                element = index;
            }

            index++;
        }

        return element;
    }

    public static int BinarySearch( int[] array, int value ) {


        int first = 0;
        int last = array.length - 1;
        int middle;
        int position = -1;

        boolean found = false;

        while (found == false && first <= last) {

            middle = (first + last)/2;

            if ( array[middle] == value ){
                found = true;
                position = middle;
            }
            else if (array[middle] > value) {
                last = middle - 1;

            }
            else
                first = middle + 1;
        }
        return position;


    }





}