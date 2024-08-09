package Classes;

public class SearchAlgorithms{

    public static int SequentialSearch( int[] array, int value ) {
        int element = -1;

        for (int index = 0; index < array.length; index++) {

            if (array[index] == value) {

                element = index;
                break;  // exit the loop once the value is found
            }

        }

        return element;
    }


    public static int BinarySearch( int[] array, int value ) {


        int first = 0;
        int last = array.length - 1;
        int middle;
        int position = -1;

        boolean found = false;

        while ( found == false && first <= last ) {

            middle = ( first + last )/2;

            if ( array[ middle ] == value ){
                found = true;
                position = middle;
            }
            else if ( array[ middle ] > value) {
                last = middle - 1;

            }
            else if ( array[ middle ] < value) {
                first = middle + 1;
            }
        }
        return position;


    }





}