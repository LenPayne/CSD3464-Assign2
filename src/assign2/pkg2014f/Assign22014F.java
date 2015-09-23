/* The following exercises are adapted from:
 * Gaddis, T. (2016). Starting Out with Java: From Control Structures through 
 * Objects. (6th ed.). Upper Saddle River, NJ: Pearson Education.
 * ISBN: 978-0-13-395705-1
 */
package assign2.pkg2014f;

import java.util.Scanner;

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class Assign22014F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Which exercise would you like to run? [1,2,3,4,5] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 1:
                    doExercise1();
                    break;
                case 2:
                    doExercise2();
                    break;
                case 3:
                    doExercise3();
                    break;
                case 4:
                    doExercise4();
                    break;
                case 5:
                    doExercise5();
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #1
     * Write a program that displays the following pattern:
     *     *
     *    * *
     *   * * *
     *  * * * *
     *   * * *
     *    * *
     *     *
     *
     * - Gaddis pg. 106
     */
    public static void doExercise1() {
        // TODO: Complete Exercise #1 Below

    }

    /* Exercise #2
     * A car's average speed for a road trip can be
     * calculated with the following formula:
     *   SPEED = km Driven / Hours of Trip
     * Write a program that asks the user for the number 
     * of km driven and the duration of the trip. It 
     * should calculate the car's speed and display the
     * result on the screen.
     *
     * - Gaddis pg. 106-7
     */
    public static void doExercise2() {
        // TODO: Complete Exercise #2 Below

    }

    /* Exercise #3
     * Write a program that asks the user to enter three 
     * assignment scores. The program should display each  
     * score, as well as the average of the scores.
     *
     * - Gaddis pg. 107
     */
    public static void doExercise3() {
        // TODO: Complete Exercise #3 Below

    }

    /* Exercise #4
     * Write a program that asks the user to enter the name 
     * of his or her favourite animal. Use a String variable 
     * to store the input. The program should display the 
     * following:
     * - The number of characters in the city name
     * - The name of the city in all uppercase letters
     * - The name of the city in all lowercase letters
     * - The first character in the name of the city
     *
     * NOTE: This was not covered in the slides. Refer to
     *  the table on pg. 74 to determine how to do this.
     *  You will use .charAt(i), .length(), .toLowerCase(), 
     *  and .toUpperCase() to accomplish this.
     *
     * - Gaddis pg. 107
     */
    public static void doExercise4() {
        // TODO: Complete Exercise #4 Below

    }

    /* Exercise #5
     * Write a program that plays a word game with the 
     * user. The program should ask the user to enter 
     * the following:
     * - His or her name
     * - The day of the week (eg- Tuesday)
     * - The name of a city
     * - The name of a business
     * - A profession
     * - A type of car
     * After the user has entered these items, the program 
     * should display the following story, inserting the 
     * user's input into appropriate locations:
     *
     * Once upon a time, NAME travelled to CITY on a DAY. They
     * were going to BUSINESS for an interview as a PROFESSION.
     * NAME drove there in a CAR. They got the job!
     *
     * - Gaddis pg. 108
     */
    public static void doExercise5() {
        // TODO: Complete Exercise #5 Below

    }
}
