/**
 * Name: [Enter Your Name Here]
 * Date: [Enter Today's Date]
 * Purpose: Refactoring the Tipping Application with Custom Methods
 * 
 * In-Class Exercise 10: Rewrite the tipping application from Lab 4 using
 * custom methods. The main method should handle user input, while two other
 * methods handle:
 * - Calculating the final cost of a meal (with tax and tip)
 * - Printing the output with proper formatting
 */

// TODO: Import the Scanner class for user input
import java.util.Scanner;

public class InClass10_Alex_Silva 
{
    public static void main(String[] args) 
    {    
        // TODO: Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
            
        // TODO: Declare a variable to store the initial cost of the meal
        // Hint: What data type should this be?
        double mealMenuCost;
            
        // TODO: Declare a variable to store the user's tip selection (1, 2, or 3)
        // Hint: What data type should this be?
        int tip;
            
        // TODO: Declare a constant for the sales tax rate (8.25% = 0.0825)
        // Hint: Use the 'final' keyword for constants
        double salesTax = 0.0825;
            
        // TODO: Prompt the user to enter the initial cost of the meal
        // Then read and store the value
        System.out.println("Please enter the initial cost of the meal: ");
        mealMenuCost = input.nextDouble();

       
            
        // TODO: Prompt the user to enter their choice for the tip
        // (1 = 10%, 2 = 15%, 3 = 20%)
        // Then read and store the value
        System.out.println("Please enter your choice for the tip (1 = 10%, 2 = 15%, 3 = 20%): ");
        tip = input.nextInt();
            
            
        // TODO: Call the calculateMealCost method to compute the final cost
        // Pass the necessary parameters: initial cost, sales tax, and tip selection
        // Store the returned value back in the cost variable
        mealMenuCost = calculateMealCost(mealMenuCost, tip, salesTax);    
            
        // TODO: Call the printReceipt method to display the final cost
        // Pass the final cost as a parameter
        printReceipt(mealMenuCost);
    }
        
    public static double calculateMealCost(double mealMenuCost, int tip, double salesTax)
    {
        mealMenuCost = mealMenuCost * (1 + salesTax);

        if (tip == 1)
        {
            mealMenuCost = mealMenuCost * 1.10;
        }
        else if (tip == 2)
        {
            mealMenuCost = mealMenuCost * 1.15;
        }
        else if (tip == 3)
        {
            mealMenuCost = mealMenuCost * 1.20;
        }
        else
            System.out.println("Invalid selection!");

        return mealMenuCost;
    }
        
        // TODO: Create a method named calculateMealCost
        // This method should:
        // - Accept three parameters: initial cost (double), sales tax (double), and tip selection (int)
        // - Return a double representing the final cost
        // - First, apply the sales tax to the initial cost
        // - Then, apply the appropriate tip percentage based on the selection
        //   * If selection is 1, apply 10% tip
        //   * If selection is 2, apply 15% tip
        //   * Otherwise, apply 20% tip
        // - Return the final cost after tax and tip
        
    public static void printReceipt(double FINAL_BILL_COST)
    {
         System.out.printf("your total bill is: %.2f.%n", FINAL_BILL_COST);
    
    }
        // TODO: Create a method named printReceipt
        // This method should:
        // - Accept one parameter: the final cost (double)
        // - Not return anything (void)
        // - Print the final cost formatted to 2 decimal places
        // - Use printf() for formatting
        // Example output: "The final cost of the meal is $XX.XX."
    
}
