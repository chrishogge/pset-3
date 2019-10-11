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

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
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

      System.out.print("\nEnter a grade: ");
      double inputGrade = in.nextDouble();
      for(int i = 0; i<5; i++){
        if((inputGrade <= GRADESARRAY[i]) && (inputGrade > GRADESARRAY[i+1])){
          System.out.print("\nYou received a " + letterGradesArray[i] + ".\n");
          break;
        } else if (inputGrade == 0){
          System.out.print("\nYou received" + letterGradesArray[4] + ".\n");
          break;
        }
      }
      }


    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      final String SUITS[] = new String[]{"Clubs","Diamonds","Hearts","Spades"};
      final String SUITSYMBOLS[] = new String[]{"C","D","H","S"};
      final String RANKS[] = new String[]{"Two","Three","Four","Five","Six",
      "Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
      final String RANKSYMBOLS[] = new String[]{"2","3","4","5","6","7","8","9","T","J","Q","K","A"};

      System.out.print("\nEnter a card: ");
      String cardInput = in.next();
      cardInput = cardInput.toUpperCase();

      String cardRank = cardInput.substring(0,1);
      String cardSuit = cardInput.substring(1,2);

      int ranksIncorrect = 0;
      int suitsIncorrect = 0;

      for(int i = 0; i<13; i++){
        if(cardRank.equals(RANKSYMBOLS[i])){
          for(int j=0; j<4; j++){
            if(cardSuit.equals(SUITSYMBOLS[j])){
              System.out.print("\n" + RANKS[i] + " of " + SUITS[j] + ".\n");
            } else if(!(cardSuit.equals(SUITSYMBOLS[j]))){
              suitsIncorrect++;
            }
            if(suitsIncorrect == 4){
              System.out.print("\n That's not a valid suit.\n");
              break;
            }
          }
        }else if(!(cardRank.equals(RANKSYMBOLS[i]))){
          ranksIncorrect++;
        }
        if(ranksIncorrect == 13){
          System.out.print("\nThat's not a valid rank.\n");
          break;
        }
      }


    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      int inputYear = in.nextInt();
      if((((inputYear%4)==0) && (((inputYear%100)!=0) || ((inputYear%400)==0)))){
        System.out.print("\n" + inputYear + " is a leap year.\n");
      }else{
        System.out.print("\n" + inputYear + " is not a leap year\n");
      }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      final double[] F_SCALE = new double[]{32,212};
      final double[] C_SCALE = new double[]{0,100};

      System.out.print("\nEnter a temperature: ");
      double inputTemp = in.nextDouble();
      System.out.print("Enter a scale: ");
      String inputScale = in.next();

      switch(inputScale){
        case "F":
            if(inputTemp <= F_SCALE[0]){
                System.out.print("\nSolid.\n");
            } else if((inputTemp > F_SCALE[0]) && (inputTemp < F_SCALE[1])){
                System.out.print("\nLiquid.\n");
            } else if(inputTemp >= F_SCALE[1]){
                System.out.print("\nGas.\n");
            }
            break;
        case "C":
				    if(inputTemp <= C_SCALE[0]){
						    System.out.print("\nSolid.\n");
				    } else if((inputTemp > C_SCALE[0]) && (inputTemp < C_SCALE[1])){
						    System.out.print("\nLiquid.\n");
				    } else if(inputTemp >= C_SCALE[1]){
						    System.out.print("\nGas.\n");
				    }
				    break;
				default:
						System.out.print("\nThat's not a valid scale.\n");
						break;
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      final String MONTHS[] = new String[]{"JAN","FEB","MAR","APR","MAY","JUN",
      "JUL","AUG","SEP","OCT","NOV","DEC"};
      final String MONTHLENGTHS[] = new String[]{"31","28 or 29","31","30","31",
      "30","31","31","30","31","30","31"};

      System.out.print("\nEnter a month: ");
      String inputMonth = in.next();
      if(inputMonth.length() > 3){
      inputMonth = inputMonth.substring(0,3);
      }
      inputMonth = inputMonth.toUpperCase();

      int incorrectMonths = 0;

      for(int i = 0; i<12; i++){
        if(inputMonth.equals(MONTHS[i])){
          System.out.print("\n" + MONTHLENGTHS[i] + " days.\n");
        }else if(!(inputMonth.equals(MONTHS[i]))){
          incorrectMonths++;
        }

        if(incorrectMonths == 12){
          System.out.print("\nThat's not a valid month.\n");
        }
      }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
      final double OT_THRESH = 40.0;
      final double PAY_MULTI = 1.5;
      double moneyMade;

      System.out.print("\nWage: ");
      double inputWage = in.nextDouble();
      System.out.print("Hours: ");
      double inputHours = in.nextDouble();

      double otHours = 0;
      double otWage = 0;

      if(inputHours > OT_THRESH){
        otHours = inputHours - OT_THRESH;
        inputHours = OT_THRESH;
        otWage = otHours * PAY_MULTI * inputWage;
      }

      if(inputWage < 0.00){
        System.out.print("\nYour wage must be greater than or equal to $0.00/hour.");
      }else if(inputHours < 0.00){
        System.out.print("\nyour hours must be greater than or equal to 0.0");
      }else{
        moneyMade = (inputWage * inputHours) + (otWage);
        System.out.print("\nYou'll make " + String.format("$%,.2f",moneyMade) + " this week.\n");
      }

    }
}
