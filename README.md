# Programming Fundamentals I - Fall 2025

## Lab Assignment #9: Die Rolls Monte Carlo Simulation

*Due at 11:59 pm the night before the next lab session*

---

## Purpose

A Monte Carlo simulation refers to the process of repeatedly performing an action and saving the outcomes or results of that action. This is frequently used to prove mathematical models or the probability of random events. A Monte Carlo simulation of die rolls will be prepared to observe the probability of getting a specific result. This lab focuses on the following concepts:

• Using a for loop to execute statements repeatedly

---

## In-Class Lesson

Consider the following case: two coins are flipped and one of the results is determined to be heads. What is the probability that the other coin is also heads? Write a program that will generate two random numbers that will be used as the results of the coin flips. A 0 will represent tails and a 1 will represent heads. Use these results to determine the probability that both coin flips are heads if at least one is heads. Include other variables to keep track of how many trials result in at least one heads, how many result in both heads, and how many result in exactly one heads. Simulate this process 10,000 times, and then print the results.

```
There were # trials with at least one result being heads.
There were # trials with both results being heads.
There were # trials with only one result being heads.
If at least one coin flip is heads, the probability that both are heads is ##.####%
If at least one coin flip is heads, the probability that only one is heads is ##.####%
```
*The above is an example program flow. Keep in mind that the coin tosses are random, so the outputs will be slightly different each time you run the program.*

---

## Task

Create a project called `DieRolls_FirstName_LastName` or `Lab9_FirstName_LastName`. Remember to include comments summarizing the program.

### Requirements

1. **Declare the following six variables** in your program:

   • Six variables of type `int` that will hold the counts for each result of the die rolls: rolling a one, rolling a two, etc.

2. **Write a for loop** that will handle 10,000 rolls. On each iteration:

   • Generate a random number from 1 to 6. This will represent the behavior of rolling a die.
   
   • Depending on the random number generated, increment the corresponding count. For example, if a 1 is randomly generated, increment the count corresponding to ones.

3. **After performing 10,000 rolls**, display the counts and the percentage of counts out of the total rolls to the console. Using `printf()`, format the percentages to two decimal places, and be careful about performing integer division.

---

## Example Output

Keep in mind that the die rolls are random, so the outputs will be slightly different each time you run the program:

```
Die Roll Results (10,000 rolls):

The total amount of ones rolled is 1634. The probability of rolling a one is 16.34%.
The total amount of twos rolled is 1667. The probability of rolling a one is 16.67%.
The total amount of threes rolled is 1775. The probability of rolling a one is 17.75%.
The total amount of fours rolled is 1651. The probability of rolling a one is 16.51%.
The total amount of fives rolled is 1648. The probability of rolling a one is 16.48%.
The total amount of sixes rolled is 1625. The probability of rolling a one is 16.25%.
```

## Running Your Program

### Method 1: Using the Terminal
1. Open the terminal in your codespace (Terminal → New Terminal)
2. Compile your program:
   ```bash
   javac Lab9_YourFirstName_YourLastName.java
   ```
3. Run your program:
   ```bash
   java Lab9_YourFirstName_YourLastName
   ```

Replace `Lab9_YourFirstName_YourLastName.java` with your actual file name. If you are running the in-class exercise, use the corresponding file name instead.

---

💡 **Fun Tip:** This program is a fun and different approach as it *DOES NOT* require input. Run it as many times as you desire to see different results each time! Don't forget to take a screenshot of terminal output and add to your directory on the left <-

---


## Commit Your Changes
### Step 1. Use VS Code's Source Control panel:
   - Click the Source Control icon in the left sidebar
   - Type a commit message describing your changes
   - Click "Commit" then "Sync Changes" to push your code

### Step 2: Verify Submission
After pushing your changes, visit your assignment repository on GitHub Classroom. Confirm that your latest code and commit message appear, and that your files are named correctly. 

### Step 3: Submit to Blackboard Assignment
Once you have verified your submission on GitHub Classroom, copy the URL of your assignment repository and submit this GitHub repository link to Blackboard as confirmation that you are DONE.

**Excellent work!** You've reached Lab 9, and this assignment introduces you to Monte Carlo simulations and the power of for loops for iterative processes. Working with random number generation and for loops will help you understand how to simulate real-world probabilistic events and analyze patterns in data. Monte Carlo simulations are used in many fields including finance, physics, engineering, and artificial intelligence to model uncertainty and make predictions. Remember to run your program multiple times to see how the percentages converge around the expected 16.67% for each die face!

**Important:** Focus on completing the lab assignment. Do NOT edit or tamper with any test files, markdown files, or class files if they appear in your repository.
