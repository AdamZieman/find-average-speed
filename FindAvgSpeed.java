/**
* Name: Adam Zieman (zieman)
* Course: CSCI 241 - Computer Science I
* Section: 001
* Assignment: 2
*
* Project/Class Description:
* The project follows IPO format to calculate the average speed in MPH after
* given two mileposts and the travel time.
*
* Known bugs:
* Will output a negative number if milepost one is larger than milepost two.
* Logic statement needed to fix this.
*/

import java.util.Scanner; // imports Scanner class

public class FindAvgSpeed {
    public static void main(String[] args) {
        // Associate Scanner with the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Explain the program to the user
        System.out.println("      Average Speed Calculator");
        System.out.println("-----------------------------------------------");
        System.out.println("Given two mileposts and an elapsed travel time");
        System.out.println("in hours and minutes, this program will calculate");
        System.out.println("the average speed in miles per hour.\n");
        
        
        // INPUT DATA
        // Ask for milepost one
        System.out.print("Enter starting milepost number: ");
        int milePostOne = keyboard.nextInt();
        
        // Ask for milepost two
        System.out.print("Enter ending milepost number: ");
        int milePostTwo = keyboard.nextInt();
        
        // Prompt for travel time input
        System.out.println("\nNow we need to know the travel time.");
        
        // Ask for hours of travel time
        System.out.print("First, enter hours: ");
        double travelHrs = keyboard.nextInt();
        
        // Ask for minutes of travel time
        System.out.print("Second, enter minutes: ");
        double travelMins = keyboard.nextInt();
        
        
        // PROCESS DATA
        // Calculate the miles traveled
        double mileTotal = milePostTwo - milePostOne;
        
        // Calculate total minutes
        double hrTotal = travelHrs + (travelMins / 60);
        System.out.println(hrTotal);
        
        // Calculate average speed
        double avgSpeed = mileTotal / hrTotal;
        
        
        // OUTPUT DATA
        System.out.println("Total distance for this trip: " + mileTotal + " miles");
        System.out.println("Average speed: " + avgSpeed + " miles per hour (MPH)");
    }
}