package Classes;

public class countdownRecursion {

    public static void countdownMethod( int n ) {

        if (n > 0) {
            System.out.print(n + " ");
            countdownMethod( n - 1 );
        }

    }
}
