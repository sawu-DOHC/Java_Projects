package Classes;

public class SortAlgorithms {

    public static int[] BubbleSort_Ascending( int[] array ) {

        int n = array.length;
        for ( int maxElement = n - 1; maxElement > 0; maxElement-- ) {

            for (int index = 0; index < maxElement; index++) {
                if (array[index] > array[index + 1]) {

                    int temp = array[ index ];
                    array[ index ] = array[ index + 1 ];
                    array[ index + 1 ] = temp;
                }
            }
        }
        return array;
    }

    public static int[] BubbleSort_Descending( int[] array ) {
        int n = array.length;
        for ( int maxElement = n - 1; maxElement > 0; maxElement-- ) {

            for ( int index = 0; index < maxElement; index++ ) {
                if ( array[index] < array[ index + 1 ] ) {

                    int temp = array[ index ];
                    array[ index ] = array[ index + 1 ];
                    array[ index + 1 ] = temp;
                }
            }
        }
        return array;
    }

    public static void selectionSort_Ascending(int[] array) {
        int n = array.length;

        for ( int startScan = 0; startScan <= n - 2; startScan++ ) {
            int minIndex = startScan;
            int minValue = array[startScan];

            for (int index = startScan + 1; index <= n - 1; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[startScan];
            array[startScan] = temp;
        }
    }

    public static void selectionSort_Descending(int[] array) {
        int n = array.length;

        for (int startScan = 0; startScan <= n - 2; startScan++) {
            int maxIndex = startScan;
            int maxValue = array[startScan];

            for (int index = startScan + 1; index <= n - 1; index++) {
                if (array[index] > maxValue) {
                    maxValue = array[index];
                    maxIndex = index;
                }
            }

            // Swap the found maximum element with the first element
            int temp = array[maxIndex];
            array[maxIndex] = array[startScan];
            array[startScan] = temp;
        }
    }

    public static void insertionSort_Ascending( int[] array ) {
        int n = array.length;

        for ( int currentIndex = 1; currentIndex < n; currentIndex++ ) {
            int unsortedValue = array[currentIndex];
            int sortedIndex = currentIndex;

            while (sortedIndex > 0 && array[sortedIndex - 1] > unsortedValue) {
                array[sortedIndex] = array[sortedIndex - 1];
                sortedIndex--;
            }
            array[sortedIndex] = unsortedValue;
        }
    }

    public static void insertionSort_Descending( int[] array ) {
        int n = array.length;

        for ( int currentIndex = 1; currentIndex < n; currentIndex++ ) {
            int unsortedValue = array[currentIndex];
            int sortedIndex = currentIndex;

            while (sortedIndex > 0 && array[sortedIndex - 1] < unsortedValue) {
                array[sortedIndex] = array[sortedIndex - 1];
                sortedIndex--;
            }
            array[sortedIndex] = unsortedValue;
        }
    }

}

