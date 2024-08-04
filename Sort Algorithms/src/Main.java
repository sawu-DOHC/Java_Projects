import Classes.SortAlgorithms;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {4, 1, 7, 10, 2, 8, 6, 9, 3, 5};

        SortAlgorithms.BubbleSort_Ascending(numbers);
        printArray(numbers);

        SortAlgorithms.BubbleSort_Descending(numbers);
        printArray(numbers);

        SortAlgorithms.selectionSort_Ascending(numbers);
        printArray(numbers);

        SortAlgorithms.selectionSort_Descending(numbers);
        printArray(numbers);

        SortAlgorithms.insertionSort_Ascending(numbers);
        printArray(numbers);

        SortAlgorithms.insertionSort_Descending(numbers);
        printArray(numbers);


    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

