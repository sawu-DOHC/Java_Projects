import Classes.SearchAlgorithms;

public class Main {

    public static void main(String[] arguments) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int resultIndex;

        resultIndex = SearchAlgorithms.SequentialSearch( numbers , 9 );
        System.out.println( "Sequential Search: Number found at index " + resultIndex );


        resultIndex = SearchAlgorithms.BinarySearch( numbers, 9);
        System.out.println("Binary Search: Number found at index " + resultIndex );




    }


}

