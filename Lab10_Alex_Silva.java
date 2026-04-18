/** Name: Alexander Silva
 *  Date: 4/6/2026
 *  Purpose: converting a previous lab into a method version
 */

import java.util.Scanner;
//importing scanner

public class Lab10_Alex_Silva
{
    public static void main(String[] args)
    {
        //declaring scanner
        Scanner input = new Scanner(System.in); //scanner

        //declaring my variables
        double initialValue;
        int years;
        double interestRate;
        double finalValue;

        System.out.println("Please enter the initial value of the home: ");
        initialValue = input.nextDouble();
        //asking the user for the initial value

        System.out.println("Please enter the number of elapsed years: ");
        years = input.nextInt();
        //asking the user for the number of years

        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();
        //asking the user for the interest rate

        finalValue = calculationFormula(interestRate, years, initialValue);

        displayFinalResult(initialValue, interestRate, years, finalValue);

    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static double calculationFormula(double interestRate, int years, double initialValue)  
    {  
        interestRate = interestRate / 100;
        double finalValue = initialValue * (Math.pow(1 + interestRate, years));
        return finalValue;
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void displayFinalResult(double initialValue, double interestRate, int years, double finalValue)
    {
        System.out.printf("Given a principal amount of $%.2f, an interest rate of %.3f%%, and %d years, the final amount is $%.2f.%n", initialValue, interestRate, years, finalValue);
    }


}