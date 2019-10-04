/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an integer: ");
      int userInputInteger1 = in.nextInt();

      if(userInputInteger1 > 0){
        System.out.print("\nPositive.\n");
      } else if(userInputInteger1 < 0){
        System.out.print("\nNegative.\n");
      } else if(userInputInteger1 == 0){
        System.out.print("\nZero.\n");
      }

    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("\nEnter an integer: ");
      int userInputInteger2 = in.nextInt();
      if((userInputInteger2%2) == 0){
        System.out.print("\nEven.\n");
      } else if((userInputInteger2%2) == 1){
        System.out.print("\nOdd.\n");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.print("\nEnter three integers.\n\nEnter integer: ");
      int orderedInt1 = in.nextInt();
      System.out.print("Enter integer: ");
      int orderedInt2 = in.nextInt();
      System.out.print("Enter integer: ");
      int orderedInt3 = in.nextInt();

      if((orderedInt1 < orderedInt2) && (orderedInt2 < orderedInt3)){
        System.out.print("\nStrictly increasing.\n");
      } else if((orderedInt1 <= orderedInt2) && (orderedInt2 <= orderedInt3)){
        System.out.print("\nIncreasing.\n");
      } else if((orderedInt1 > orderedInt2) && (orderedInt2 > orderedInt3)){
        System.out.print("\nStrictly decreasing.\n");
      } else if((orderedInt1 >= orderedInt2) && (orderedInt2 >= orderedInt3)){
        System.out.print("\nDecreasing.\n");
      } else{
        System.out.print("\nUnordered.\n");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
      System.out.print("\nEnter a letter grade: ");
      String inputGPA = in.next();
      inputGPA = inputGPA.toUpperCase();
      String inputGPAMod;
      String inputGPALetter = inputGPA.substring(0,1);
      if(inputGPA.length() == 2){
        inputGPAMod = inputGPA.substring(1,2);
      } else{
        inputGPAMod = "";
      }
      String letterArray[];
      letterArray = new String[]{"A","B","C","D","F"};
      double numberArray[];
      numberArray = new double[]{4,3,2,1,0};
      double letterMod = 0.33;

      double calcGPA = 0.0;

      for(int i = 0; i<5; i++){
        if(inputGPALetter.equals(letterArray[i])){
          calcGPA = numberArray[i];
          if(inputGPA.length() == 2){
            if(inputGPAMod.equals("+") && (calcGPA != 4.0 && calcGPA != 0.0)){
              calcGPA = calcGPA + letterMod;
            } else if(inputGPAMod.equals("-") && (calcGPA != 0.0)){
              calcGPA = calcGPA - letterMod;
            }
            break;
          }
        }
      }

      System.out.print("\nYour GPA is " + calcGPA + ".\n");
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      final double GRADESARRAY[] = new double[]{100,89,79,69,59,0};
      String letterGradesArray[] = new String[]{"A","B","C","D","F"};

      System.out.print("Enter a grade: " + GRADESARRAY[5]);
      double inputGrade = in.nextDouble();
      for(int i = 0; i<5; i++){
        if((inputGrade <= GRADESARRAY[i]) && (inputGrade > GRADESARRAY[i+1])){
          System.out.print(letterGradesArray[i]);
        }
      }
      }


    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
