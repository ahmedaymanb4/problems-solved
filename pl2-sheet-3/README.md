# Problems? Solved

## Sheet #3, PL2

Here are my code submissions for sheet #3, as a part of Programming Languages-2 course, FCAI-H. 

### Problems Source 

1. Chapter 9 "**Programming Exercises**", from the textbook "[Introduction to Java Programming and Data Structures, Comprehensive Version (12th Edition) 2020](https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/)".
2. A mini project named "Account"

### 1. I answered the chapter questions:

- [x] Question #9.1

- [x] Question #9.2

- [x] Question #9.3

- [x] Question #9.4

- [x] Question #9.5

- [x] Question #9.6

- [x] Question #9.9

- [x] Question #9.11

### 2. "Account" Java Class:

I Design a class named **Account** that contains: 

- A `private int` data field named **id** for the account (default 0). 
- A `private double` data field named **balance** for the account (default 0). 
- A `private double` data field named **annualInterestRate** that stores the current interest rate (default 0). Assume all accounts have the same interest rate. 
- A `private Date` data field named **dateCreated** that stores the date when the account was created. 
- A `no-arg constructor` that creates a default account. 
- A `constructor` that creates an account with the specified id and initial balance. 
- The `accessor and mutator methods` for id, balance, and annualInterestRate. 
- The `accessor method` for dateCreated. 
- A method named `getMonthlyInterestRate()` that returns the monthly interest rate. 
- A method named `withdraw()` that withdraws a specified amount from the account. 
- A method named `deposit()` that deposits a specified amount to the account.

Then A test program that:  

- Creates an Account object with an account ID of 1122, 
    - a balance of $20,000, 
    - and an annual interest rate of 4.5%. 
- Uses the withdraw method to withdraw $2,500, 
- Uses the deposit method to deposit $3,000, 
- And prints the balance, the monthly interest, and the date when this account was created.
