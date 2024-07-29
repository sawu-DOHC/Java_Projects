package Classes;

public class Ticket {

    // VARIABLES
    public static int rowTracker = 0;


    public int row = rowTracker;
    public int[] numbers = new int[6];
    public boolean powerballWinner = false;
    public int matchingCounts = 0;
    public double reward = 0;

    // CONSTRUCTORS
    public Ticket( int[] new_ticketNumbers, boolean new_isPowerballWinner, int new_matchCount, double new_rewardAmount ) {

        for ( int i = 0; i < 6; i++ ) {
            this.numbers[i] = new_ticketNumbers[i];
        }
        this.powerballWinner = new_isPowerballWinner;
        this.matchingCounts = new_matchCount;
        this.reward = new_rewardAmount;

        rowTracker++;

        System.out.printf("%7s %-4d %9s %-5b %11s %-2d %8s %5.2f$\n", "Ticket #:", row, "Winner:", powerballWinner, "Matches:", matchingCounts, "Reward:", reward);


    }

}