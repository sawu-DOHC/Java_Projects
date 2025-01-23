import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

import Classes.*;
public class Main {

    public static void main(String[] args) {

        int arraySize69 = 69;
        int arraySize35 = 35;

        ArrayList<Ticket> Ticket_List = new ArrayList<Ticket>();//creating an array list of ticket objects that i will use to add Ticket objects to


        //defining the winning ticket
        int[] winTicketNumbers = new int[]{07,8,19,26,36,15};
        Ticket winTicket = new Ticket (winTicketNumbers, true,0,  0);

        //creating an array of numbers to store information about normal numbers
        NormalNumber[] normalNumbers = new NormalNumber[arraySize69];
        Util.initializeNumberArray(normalNumbers);

        //creating a secondary array of number objects to store information about Powerball numbers specifically
        PowerballNumber[] powerballNumbers = new PowerballNumber[35];
        Util.initializePowerballNumberArray(powerballNumbers);

        try {

            File SampleInput = new File ("Lottery Game Data Management/src/sampleData.txt");//file to store statistics about the project

            Scanner inputScanner = new Scanner(SampleInput);


            while (inputScanner.hasNextInt() == true) {

                int[] tempTicketNumbers = new int[6];//these are three temporary variables used for the ticket object constructor
                boolean tempPowerballWinner = false;
                int tempMatchingCounts = 0;
                int tempReward = 0;

                Util.fillTempTicketNumbers( tempTicketNumbers, inputScanner );


                for (int i = 0; i <= 5; i++) {//this nested for-loop compares each "ticket" object with the winning ticket object

                    for (int j = 0; j <= 5; j++) {

                        if (tempTicketNumbers[i] == winTicket.numbers[j]) {//here i compare the contents of the two arrays and increment the "matches" variable that i made to track how many matching numbers the ticket had
                            tempMatchingCounts = tempMatchingCounts + 1;//this variable will be used to calculate the reward, this also just checks for the presence of all 6 numbers the next if statement will check the last index
                        }
                        if (tempTicketNumbers[5] == winTicket.numbers[5] && tempMatchingCounts == 6) {                  //this if statement compares the last indexes and checks the number of matches to make sure its 6, meaning all 6 numbers are present
                            tempPowerballWinner = true;                                                                 //so if all 6 numbers are present in any order, and the last index matches the powerball, it is declared the winning ticket.
                        }                                                                                               //this changes our powerball boolean variable to true,
                        else {
                            tempPowerballWinner = false;                                                                //if none of the conditions are met in the previous 2 if statements, the powerball boolean is set to false
                        }
                    }
                }



                Util.updateFrequencyAndOverduenessNormalNumbers( normalNumbers, tempTicketNumbers, arraySize69);

                Util.updateFrequencyAndOverduenessPowerballNumbers( powerballNumbers, tempTicketNumbers );

                tempReward = Util.calculateReward( tempMatchingCounts, tempPowerballWinner); // just found out you cant pass primitive values by reference only by value, C++ can do this so its better!

                Ticket ticket_object = new Ticket(tempTicketNumbers, tempPowerballWinner, tempMatchingCounts,  tempReward); //creating a ticket object for every 6 integer the scanner object receives

                Ticket_List.add( ticket_object );                                                                             //adding the current "ticket_object" to the array list

            }
        }
        catch (FileNotFoundException FNF) {
            System.out.println("File not found.");
        }

        Ticket[] Ticket_Object_Array = new Ticket[Ticket_List.size()];                                                      //im a bit more comfortable using primitive arrays but i needed theh add function from array list
        Ticket_Object_Array = Ticket_List.toArray(Ticket_Object_Array);                                                     //so this piece of code converts the array list to a primitive array

        System.out.println();

        Util.sort_array_frequency_descending(normalNumbers);
        Util.printMostCommonNumbers(normalNumbers);

        //2) DISPLAY THE 10 LEAST COMMON NUMBERS
        Util.sort_array_frequency_ascending(normalNumbers);
        Util.printLeastCommonNumbers(normalNumbers);

        //3) DISPLAY THE 10 MOST OVERDUE NUMBERS
        Util.sort_array_overdueness_descending(normalNumbers);
        Util.printMostOverdueNumbers(normalNumbers);

        //4) DISPLAY THE FREQUENCY OF EACH NUMBER (1-69)
        Util.sort_array_value_ascending(normalNumbers);
        Util.printNumberFrequencies(normalNumbers, arraySize69);

        //5) DISPLAY THE FREQUENCY OF EACH POWERBALL NUMBER (1-35)
        Util.printPowerballFrequencies(powerballNumbers, arraySize35);
    }

}


