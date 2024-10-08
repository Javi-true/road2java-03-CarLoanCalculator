# Car Loan Program

This project is created to practice basic Java programming skills, focusing on object-oriented programming, conditional statements, and simple arithmetic calculations. The program calculates monthly car loan payments based on a few key variables such as the total loan amount, loan length, interest rate, and down payment.

## Key Concepts Practiced:
1. **Instance Fields:**  
   The class `CarLoan` contains several instance fields such as `carLoan`, `loanLength`, `interestRate`, and `downPayment`. These fields store important loan information that is used for further calculations.

2. **Conditional Statements:**  
   The `validation()` method uses `if-else` conditions to check the validity of the loan. It ensures that the loan length and interest rate are positive and verifies whether the down payment is sufficient to cover the total cost of the car.

3. **Arithmetic Calculations:**  
   If the loan is valid, the program calculates the monthly payment by computing the remaining balance after the down payment, dividing it by the total number of months, and then adding the monthly interest.

4. **Object Creation:**  
   An instance of the `CarLoan` class is created in the `main` method, where the `validation()` method is called to calculate and print the monthly payment or relevant error message.

## Objective:
The main objective of this project is to practice:
- Declaring and using instance fields
- Implementing conditional logic
- Performing basic mathematical operations in Java
- Using constructors and creating objects
