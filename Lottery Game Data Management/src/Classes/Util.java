package Classes;

import java.util.Scanner;

public class Util {

    public static void sort_array_value_ascending(NormalNumber[] n ) {
        for (int i = 1; i < 69; i++) {
            for (int j = 0; j < 69;j++) {
                NormalNumber temp;
                if (n[i].value < n[j].value) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    // bubble sorting algorithm i learned to make in programming design and development from pseudo code!
    // the next 4 methods are all variations of the same sorting algorithm they just sort by different attributes
    // same algorithm but descending
    //less than sign = ascending as you go down, starting at 1 omits the 0
    public static void sort_array_value_descending(NormalNumber[] n ) {
        for (int i = 0; i <= 69; i++) {
            for (int j = i + 1; j < 69; j++) {
                NormalNumber temp;
                if (n[i].value < n[j].value) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    public static void sort_array_overdueness_ascending(NormalNumber[] n ) {
        for (int i = 1; i < 69; i++) {
            for (int j = 0; j < 69;j++) {
                NormalNumber temp;
                if (n[i].overdueness < n[j].overdueness) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }

    public static void sort_array_overdueness_descending(NormalNumber[] n ) {

        for (int i = 0; i <= 69; i++) {
            for (int j = i + 1; j < 69; j++) {
                NormalNumber temp;
                if (n[i].overdueness < n[j].overdueness) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    //less than sign = ascending as you go down, starting at 1 omits the 0
    public static void sort_array_frequency_ascending(NormalNumber[] n ) {
        for (int i = 1; i < 69; i++) {
            for (int j = 0; j < 69;j++) {
                NormalNumber temp;
                if (n[i].frequency < n[j].frequency) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
    public static void sort_array_frequency_descending(NormalNumber[] n ) {

        for (int i = 0; i <= 69; i++) {
            for (int j = i + 1; j < 69; j++) {
                NormalNumber temp;
                if (n[i].frequency < n[j].frequency) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }

    public static void initializeNumberArray( NormalNumber[] array ) {
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = new NormalNumber(i);
        }
    }
    public static void initializePowerballNumberArray(PowerballNumber[] array) {
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = new PowerballNumber(i);
        }
    }

    public static void fillTempTicketNumbers(int[] tempTicketNumbers, Scanner inputScanner) {
        for (int i = 0; i < 6; i++) {
            tempTicketNumbers[i] = inputScanner.nextInt();
        }
    }

    public static void updateFrequencyAndOverduenessPowerballNumbers(PowerballNumber[] powNums, int[] ticketNumbers) {
        for (int i = 0; i < powNums.length; i++) {
            if (powNums[i].value == ticketNumbers[5]) {
                powNums[i].frequency++;
                powNums[i].overdueness = 0;
            } else {
                powNums[i].overdueness++;
            }
        }
    }
    public static void updateFrequencyAndOverduenessNormalNumbers(NormalNumber[] nums, int[] tempTicketNumbers, int arraySize69) {
        for (int i = 0; i < arraySize69; i++) {
            for (int j = 0; j <= 5; j++) {
                if (nums[i].value == tempTicketNumbers[j]) {
                    nums[i].frequency++;
                    nums[i].overdueness = 0;
                } else {
                    nums[i].overdueness++;
                }
            }
        }
    }

    public static int calculateReward( int matchingCounts, boolean isPowerballWinner ) {

        int reward;

        switch ( matchingCounts ) {
            case 0:
                reward = 0;
                break;
            case 1:
                reward = 10;
                break;
            case 2:
                reward = 20;
                break;
            case 3:
                reward = 30;
                break;
            case 4:
                reward = 40;
                break;
            case 5:
                reward = 50;
                break;
            case 6:
                if (isPowerballWinner) {
                    reward = 9999;
                } else {
                    reward = 60;
                }
                break;
            default:
                reward = 0;
        }
        return reward;
    }
    public static void printMostCommonNumbers(NormalNumber[] normalNumbers) {
        System.out.println("1) 10 MOST COMMON NUMBERS, ORDERED BY FREQUENCY, DESCENDING (greatest to least). ");
        System.out.printf("%10s %10s %10s \n", "Ranking", "Value", "Frequency");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%10d %10d %10d \n", (i + 1), normalNumbers[i].value, normalNumbers[i].frequency);
        }
        System.out.println();
    }
    public static void printLeastCommonNumbers(NormalNumber[] normalNumbers) {
        System.out.println("2) 10 LEAST COMMON NUMBERS, ORDERED BY FREQUENCY, ASCENDING (least to greatest). ");
        System.out.printf("%10s %10s %10s \n", "Ranking", "Value", "Frequency");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%10d %10d %10d \n", (i + 1), normalNumbers[i].value, normalNumbers[i].frequency);
        }
        System.out.println();
    }
    public static void printMostOverdueNumbers(NormalNumber[] normalNumbers) {
        System.out.println("3) THE 10 MOST OVERDUE NUMBERS (greatest to least). ");
        System.out.printf("%10s %10s %10s \n", "Ranking", "Value", "Overdueness");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%10d %10d %10s \n", (i + 1), normalNumbers[i].value, normalNumbers[i].overdueness);
        }
        System.out.println();
    }
    public static void printNumberFrequencies(NormalNumber[] normalNumbers, int arraySize) {
        System.out.println("4) DISPLAY THE FREQUENCY OF EACH NUMBER (1-69)");
        System.out.printf("%10s %10s \n", "Value", "Frequency");
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("%10d %10d \n", normalNumbers[i].value, normalNumbers[i].frequency);
        }
        System.out.println();
    }
    public static void printPowerballFrequencies(PowerballNumber[] powerballNumbers, int arraySize) {
        System.out.println("5) DISPLAY THE FREQUENCY OF EACH POWERBALL NUMBER (1-35)");
        System.out.printf("%10s %10s \n", "Value", "Frequency");
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("%10d %10d \n", powerballNumbers[i].value, powerballNumbers[i].frequency);
        }
        System.out.println();
    }


}
