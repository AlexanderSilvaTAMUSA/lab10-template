/**
 * Name: [Enter Your Name Here]
 * Date: [Enter Today's Date]
 * Purpose: Monte Carlo Simulation - Coin Flip Probability
 * 
 * In-Class Exercise: Two coins are flipped and one is determined to be heads.
 * What is the probability that the other coin is also heads?
 * 
 * Write a program that simulates this 10,000 times and tracks:
 * - How many trials have at least one heads
 * - How many trials have both heads
 * - How many trials have exactly one heads
 */

// Import Random class for generating random numbers


public class InClass9_FirstName_LastName 
{
    public static void main(String[] args) 
    {    
        // TODO: Declare a variable to count trials with at least one heads
        // Hint: What should the initial value be?
        
        
        // TODO: Declare a variable to count trials with both heads
        // Hint: What should the initial value be?
        
        
        // TODO: Declare a variable to count trials with exactly one heads
        // Hint: What should the initial value be?
        
        
        // TODO: Write a for loop to simulate 10,000 coin flips
        // Inside the loop:
        //   1. Generate a random number 0 or 1 for the first coin
        //      (Hint: Use the proper Math.random() equation)
        //   2. Generate a random number 0 or 1 for the second coin
        //   3. Determine IF at least one coin is heads (equals 1) using proper LOGICAL OPERATOR
        //   4. If at least one is heads, increment the "at least one" counter
        //   5. Nested within, use another IF block to Check if both coins are heads (proper LOGICAL operator)
        //   6. If both are heads, increment the "both heads" counter
        //   7. Check if exactly one coin is heads
        //   8. Otherwise exactly one is heads, so increment the "exactly one" counter
        

        // TODO: After the loop ends, calculate probabilities
        // Hint: Divide the count by the total number of trials (10000)
        
        
        // TODO: Calculate the probability that both coins are heads 
        // GIVEN that at least one is heads
        // This is: (trials with both heads) / (trials with at least one heads)

        // TODO: Calculate the probability that exactly ONE coin is heads 
        // GIVEN that at least one is heads
        // This is: (trials with exactly ONE heads) / (trials with at least one heads)
        
        
        // TODO: Display the results formatted to 4 decimal places, using printf()
        // See README.md for example output
    }
}