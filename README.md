# Lab 10: Compound Interest Calculator with Custom Methods
**Due Date:** @ 11:59 the night *before* next lab

**Submission:** Push to GitHub repository + Submit link to Blackboard

---

## 📋 Overview
This lab introduces **custom methods**, one of the most powerful tools for organizing and modularizing your code. You'll build a compound interest calculator for a real estate application that demonstrates both **value-returning methods** and **void methods**. By breaking down your program into smaller, focused functions, you'll create more maintainable, reusable, and professional code. This approach is fundamental to software engineering and mirrors how real-world applications are structured.

**Learning Objectives:**
- Implement value-returning methods that perform calculations
- Implement void methods that handle output formatting
- Design method signatures with appropriate parameters and return types
- Call custom methods from the main method
- Apply the compound interest formula correctly
- Use proper formatting with `printf()` for financial data
- Convert between percentages and decimal representations
- Understand modular programming and code organization
- Practice bottom-up implementation strategies

---

## 🚀 Getting Started with GitHub Codespaces

### Initial Setup
1. **Accept the assignment** via the GitHub Classroom link provided
2. **Open your repository** in GitHub Codespaces:
   - Click the green "**Code**" button
   - Select "**Codespaces**" tab
   - Click "**Create codespace on main**"
3. **Wait for the environment to load** (this may take 1-2 minutes on first launch)
4. **Explore your workspace** - On the left side, you'll see the file explorer with:
   - `README.md` (this file)
   - `InClass10_FirstName_LastName.java` - for your in-class activity
   - Other supporting files

**Note:** You will create the `Lab10_FirstName_LastName.java` file yourself. Update all filenames and class headers with your actual first and last name.

---

## 📚 Key Concepts for This Lab

This lab represents a major milestone in your programming journey—you're now creating programs with multiple custom methods! **Review your lecture notes, textbook, and class examples** for detailed explanations of method syntax and design.

### What Are Methods?
A **method** is a named block of code that performs a specific task. Methods allow you to:
- Break complex problems into manageable pieces
- Reuse code without repetition
- Make your program easier to read, test, and debug
- Organize functionality logically

Think of methods like recipes in a cookbook—each recipe (method) has a specific purpose, takes certain ingredients (parameters), and produces a result (return value or output).

### Value-Returning Methods
A **value-returning method** performs a calculation or operation and returns a result to the caller.

**Key characteristics:**
- Has a return type (e.g., `double`, `int`, `String`)
- Uses the `return` statement to send a value back
- Can be used in expressions or assigned to variables

**Example pattern:**
```java
public static double calculateSomething(double param1, int param2) {
    // Perform calculation
    double result = param1 * param2;
    return result;  // Send result back to caller
}
```

**In your main method, you would call it like:**
```java
double answer = calculateSomething(5.5, 10);
```

### Void Methods
A **void method** performs an action (like printing output) but doesn't return a value.

**Key characteristics:**
- Has `void` as the return type
- Does not use a `return` statement (or uses `return;` with no value)
- Typically used for output, updates, or side effects

**Example pattern:**
```java
public static void displayResults(double value1, double value2) {
    // Display formatted output
    System.out.printf("Values: %.2f and %.2f%n", value1, value2);
}
```

**In your main method, you would call it like:**
```java
displayResults(10.5, 20.75);
```

### Method Signatures and Parameters
A **method signature** includes the method's name and parameter list. When calling a method, you must pass arguments that match the expected parameter types in the correct order.

**Think about:**
- What data does this method need to do its job? (These become parameters)
- What data type should each parameter be?
- Should this method return something, or just perform an action?

### The Compound Interest Formula
Compound interest is how investments grow over time. The formula is:

**A = P(1 + r)^t**

Where:
- **A** = Final amount (what we're calculating)
- **P** = Principal (initial amount)
- **r** = Interest rate (as a decimal, not a percent!)
- **t** = Time in years

**Critical reminders:**
- Convert percentages to decimals: 2.5% becomes 0.025
- Use `Math.pow()` for exponentiation: `Math.pow(base, exponent)`
- Watch your order of operations: parentheses matter!

### Formatting Financial Data
Financial applications require precise formatting. Use `printf()` with format specifiers:
- `%.2f` - Two decimal places (for dollar amounts)
- `%.3f` - Three decimal places (for interest rates as percentages)
- Include dollar signs and appropriate spacing for readability

---

**Before starting the lab, make sure you understand:**
- The difference between value-returning methods and void methods
- How to declare methods with the correct return type and parameters
- How to call methods and use their return values
- How to convert percentages to decimals for calculations
- How to use `Math.pow()` for exponentiation
- How to format output with `printf()`

**Refer to:** Your lecture notes, textbook chapters on methods, and in-class examples.

---

## 📝 Part 1: In-Class Activity (Participation Points)
**File to Work With:** `InClass10_FirstName_LastName.java`

### Background
Remember the tipping calculator from **Lab 4**? Back then, you wrote all the code in one main method. Now that you understand custom methods, it's time to **refactor** (reorganize and improve) that program using a modular approach. This is exactly what professional developers do—revisiting old code and making it better with new techniques!

### Task
Refactor the tipping application so that the main method only handles user input, while two custom methods handle the calculation and output.

**Requirements:**

1. **Update** the filename and class name with your actual first and last name

2. **Main method responsibilities:**
   - Create a Scanner object for user input
   - Declare a variable to store the initial meal cost (choose a descriptive name)
   - Declare a variable for the tip selection as an integer (choose a descriptive name)
   - Declare a constant for the sales tax rate with value 0.0825 (choose a descriptive name in ALL_CAPS)
   - Prompt the user to enter the initial cost of the meal (exact wording: `"Please enter the initial cost of the meal: "`)
   - Prompt the user to select a tip option (exact wording: `"Please enter your choice for the tip (1 = 10%, 2 = 15%, 3 = 20%): "`)
   - Call the calculation method and store the result
   - Call the output method to display the results

3. **Create a value-returning method** to calculate the final cost:
   - **Name:** Choose a descriptive name (examples: `calculateMealCost`, `computeTotalCost`, `getFinalAmount`)
   - **Parameters:** Must accept three parameters in any order you choose:
     - A double for the initial meal cost
     - A double for the sales tax rate
     - An int for the tip selection
     - Choose descriptive parameter names
   - **Return type:** `double`
   - **Logic:** 
     - First apply sales tax to the initial cost
     - Then apply the tip based on the selection (1 = multiply by 1.1, 2 = multiply by 1.15, 3 = multiply by 1.2)
     - Use if-else-if or switch statement to handle the selection
   - **Return:** The final total cost

4. **Create a void method** to display formatted output:
   - **Name:** Choose a descriptive name (examples: `printReceipt`, `displayTotal`, `showFinalCost`)
   - **Parameters:** Must accept the final cost as a double (choose a descriptive parameter name)
   - **Return type:** `void`
   - **Logic:** Use `printf()` to display the final cost with proper formatting
   - **Output format:** Must match: `"The final cost of the meal is $%.2f.%n"`
   - Format dollar amounts to two decimal places

5. **Testing:** Test with different meal costs and tip selections

### Example Output
```
Please enter the initial cost of the meal: 45.50
Please enter your choice for the tip (1 = 10%, 2 = 15%, 3 = 20%): 2
The final cost of the meal is $56.70.
```

**Note:** The calculation is: $45.50 × 1.0825 (tax) = $49.25 × 1.15 (15% tip) = $56.6375 → rounds to $56.64 (depending on rounding).

💡 **Remember:** Take a screenshot of your terminal output showing your program results and add it to your repository (drag and drop into the file explorer on the left).

### Think About It
How much easier is this program to read now that it's organized into methods? Each method has one clear responsibility. If you needed to add a fourth tip option, you'd know exactly which method to modify. This is the power of modular programming!

---

## 🔬 Part 2: Main Lab Assignment

### Background
A real estate agent needs an application to help clients understand how home values appreciate over time. By calculating compound interest, clients can see the projected value of their property investment after a certain number of years. This tool will help them make informed decisions about purchasing property as an investment.

### The Big Picture
You'll create a professional application with three methods working together:
1. **Main method** - Handles user interaction
2. **Calculation method** - Computes compound interest (returns a value)
3. **Display method** - Presents formatted results (void method)

This is a **bottom-up implementation**: you'll build the calculation and display methods first, then bring them together in the main method.

### Task
Create a file named `Lab10_FirstName_LastName.java` (replace with your actual name). Include comprehensive comments describing your program's purpose and each method's job.

---

## 🛠️ Implementation Guide

### Step 1: Implement the Compound Interest Calculation Method

Create a **value-returning method** that calculates compound interest.

**Method design:**
- **Method name:** Choose something descriptive (examples: `calculateValue`, `computeCompoundInterest`, `getFinalHomeValue`)
- **Return type:** `double` (the final amount)
- **Parameters:** Must accept three parameters **IN THIS ORDER**:
  1. A double for the initial value of the home (choose a descriptive parameter name)
  2. An int for the number of years (choose a descriptive parameter name)
  3. A double for the interest rate as a percentage (choose a descriptive parameter name)

**Implementation steps:**
1. **Convert the rate from percentage to decimal** by dividing by 100
2. Apply the compound interest formula: **A = P(1 + r)^t**
3. Use `Math.pow()` for computing (1 + r)^t
4. Return the final amount

**Critical reminders:**
- Use parentheses correctly: `(1 + rate)` must be calculated before raising to the power
- This method handles the percentage-to-decimal conversion internally
- Choose meaningful variable names for any local variables you create
- Test your logic: If rate is 5.0 (5%), after dividing by 100 you get 0.05, and if years is 10, the multiplier is (1.05)^10 ≈ 1.629

---

### Step 2: Implement the Output Formatting Method

Create a **void method** that displays the results with proper formatting.

**Method design:**
- **Method name:** Choose something descriptive (examples: `printValue`, `displayResults`, `showHomeValue`)
- **Return type:** `void` (this method prints, doesn't return)
- **Parameters:** Must accept four parameters **IN THIS ORDER**:
  1. A double for the initial amount (choose a descriptive parameter name)
  2. An int for the number of years (choose a descriptive parameter name)
  3. A double for the interest rate as a percentage (choose a descriptive parameter name)
  4. A double for the calculated final amount (choose a descriptive parameter name)

**Implementation steps:**
1. Use `printf()` to format the output
2. Format the initial amount and final value to **two decimal places** (%.2f)
3. Format the interest rate to **three decimal places** (%.3f)
   - The rate is already a percentage, so display it directly
   - Example: if rate is 2.175, display it as 2.175%
4. **Required output format:** Must match exactly: `"Given a principal amount of $%.2f, an interest rate of %.3f%%, and %d years, the final amount is $%.2f.%n"`

**Remember:** This method doesn't return anything—it just displays formatted output. Notice the double %% to print a literal % symbol.

---

### Step 3: Implement the Main Method

Now bring everything together in the main method.

**Implementation steps:**

1. **Create a Scanner object** for reading user input (choose a descriptive name)

2. **Declare variables** (choose descriptive names):
   - A double to store the initial value of the home
   - An int to store the time period in years
   - A double to store the interest rate as entered by user (as a percentage)
   - A double to store the result from your calculation method

3. **Prompt the user for input IN THIS ORDER (exact wording required):**
   - First prompt: `"Please enter the initial value of the home: "`
   - Second prompt: `"Please enter the number of elapsed years: "`
   - Third prompt: `"Please enter the interest rate: "`
   - Note: The user enters the rate as a percentage (e.g., 2.175 for 2.175%)

4. **Call your calculation method:**
   - Pass the three values **in the order your method expects them** (initial value, years, rate)
   - DO NOT convert the rate in main—the calculation method will handle the conversion
   - Store the returned value in your final value variable

5. **Call your display method:**
   - Pass the four values **in the order your method expects them** (initial, years, rate, finalValue)
   - The rate is still in percentage form when passed to this method

---

## 💻 Example Output

```
Please enter the initial value of the home: 137000
Please enter the number of elapsed years: 15
Please enter the interest rate: 2.175
Given a principal amount of $137000.00, an interest rate of 2.175%, and 15 years, the final amount is $189186.55.
```

**Test your program with different values:**
- Small principal, large time span
- Large principal, small time span
- Different interest rates

Your calculations should be mathematically accurate to two decimal places.

---

## 🏃 Running Your Program

### Using the Terminal
1. Open the terminal in your codespace (Terminal → New Terminal)
2. Navigate to your project directory if needed
3. Compile your program:
   ```bash
   javac Lab10_FirstName_LastName.java
   ```
4. Run your program:
   ```bash
   java Lab10_FirstName_LastName
   ```

Replace `Lab10_FirstName_LastName` with your actual first and last name.

**For the in-class activity:** Use the filename `InClass10_FirstName_LastName` instead.

💡 **Remember:** After running your program, take a screenshot of your console output and add it to your file directory on the left as part of your submission.

---

## ✅ Grading Criteria

This lab is worth **100 points** total, distributed as follows:

### Comments (5 points)
- Clear program description at the top of the file
- Comments explaining what each method does
- Comments on any complex logic

### Calculation Method (35 points)
- Correct method signature with appropriate return type and parameters (10 points)
- Proper implementation of the compound interest formula (15 points)
- Correct use of `Math.pow()` (5 points)
- Returns the correct value (5 points)

### Display Method (35 points)
- Correct method signature with void return type and appropriate parameters (10 points)
- Displays all required information (10 points)
- Proper formatting with `printf()` (10 points)
  - Principal and final amount to two decimal places
  - Interest rate to three decimal places
- Professional output presentation (5 points)

### Main Method (25 points)
- Scanner and variable declarations with appropriate data types and descriptive names (5 points)
- User prompts with exact wording as specified (10 points)
- Proper calls to both custom methods with correct argument order (10 points)

---

## 📤 Commit Your Changes

### Step 1: Use VS Code's Source Control panel
- Click the Source Control icon in the left sidebar (looks like a branch)
- Review your changes in the staging area
- Type a descriptive commit message (e.g., "Completed Lab 10: Compound Interest Calculator")
- Click "**Commit**" then "**Sync Changes**" to push your code to GitHub

### Step 2: Verify Submission
After pushing your changes:
1. Visit your assignment repository on GitHub Classroom
2. Confirm that your latest code and commit message appear
3. Verify that your files are named correctly with your actual first and last name
4. Check that your screenshot is included in the repository

### Step 3: Submit to Blackboard Assignment
1. Copy the URL of your assignment repository from GitHub
2. Submit this GitHub repository link to the corresponding Blackboard assignment
3. This confirms you are DONE and ready for grading

---

## 🎉 Closing Thoughts

**Congratulations!** You've reached Lab 10, and this assignment represents a significant step in your programming journey. You're no longer writing simple sequential programs—you're now creating **modular, professional-quality applications** with custom methods.

**What you've learned:**
- How to design and implement value-returning methods
- How to create void methods for specialized tasks
- How to organize programs into logical, reusable components
- How to work with the compound interest formula
- How to format financial data professionally

**Why this matters:** Every professional application you use—from mobile apps to web services—is built using methods and functions. Breaking problems into smaller pieces is the foundation of software engineering. The techniques you've practiced in this lab will be used in every program you write from now on.

**Moving forward:** As programs become more complex, methods become even more essential. You'll soon learn about passing objects, working with arrays in methods, and even more advanced organizational techniques.

**Remember:** Include detailed comments describing what each method does. Future you (and your graders!) will appreciate it!

---

**Important:** Focus on completing the lab assignment. Do NOT edit or tamper with any test files, markdown files, or class files if they appear in your repository.

