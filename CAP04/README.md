### 1. Weighted Average Calculation ➕  
The program calculates the weighted average of a student's grades based on three components: laboratory work (weight 2), semester evaluation (weight 3), and final exam (weight 5). It then assigns a grade based on the weighted average using the following scale: A for 8.0-10.0, B for 7.0-8.0, C for 6.0-7.0, D for 5.0-6.0, and E for 0.0-5.0. 
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA02/blob/main/CAP04/Q01/src/br/edu/principal/Principal.java)  

---

### 2. Arithmetic Average Calculation ➕  
The program receives three grades from a student, calculates the arithmetic average, and displays the corresponding message based on the following scale: "Reprovado" for average 0.0-3.0, "Exame" for average 3.0-7.0, and "Aprovado" for average 7.0-10.0. If the student is in "Exame," the program also calculates and displays the grade required to pass, considering that a minimum average of 6.0 is needed for approval.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA02/blob/main/CAP04/Q02/src/br/edu/principal/Principal.java)

---

### 3. Find the Greater Number ➕  
The program receives two numbers as input and displays the greater of the two.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q03/src/br/edu/principal/Principal.java)

---

### 4. Sort Three Numbers in Ascending Order ➕  
The program receives three different numbers as input and displays them in ascending order.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q04/src/br/edu/principal/Principal.java)

---

### 5. Sort Four Numbers in Descending Order ➕  
The program receives three numbers in strictly ascending order and a fourth number that is not in order. It then displays all four numbers in descending order.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q05/src/br/edu/principal/Principal.java)

---

### 6. Check If a Number Is Even or Odd ➕  
The program receives an integer as input and checks whether it is even or odd, displaying the result accordingly.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q06/src/br/edu/principal/Principal.java)

---

### 7. Sort and Display Values Based on Input ➕  
The program receives four values: I (an integer) and A, B, and C (real numbers). Depending on the value of I, it displays A, B, and C in different orders: for I = 1, the numbers are shown in ascending order; for I = 2, in descending order; and for I = 3, the largest number is placed between the other two.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q07/src/br/edu/principal/Principal.java)

---

### 8. Menu for Operations ➕  
The program displays a menu with options to either add two numbers or calculate the square root of a number, then executes the chosen operation based on the user's input.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q08/src/br/edu/principal/Principal.java)

---

### 9. Display System Date and Time ➕  
The program displays the system's current date and time in the format DD/MM/YYYY – month in full and hour:minute.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q09/src/br/edu/principal/Principal.java)

---

### 10. Determine the Chronologically Later Date ➕  
The program receives two dates from the user, each composed of day, month, and year values, and determines which of the two dates is chronologically later.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q10/src/br/edu/principal/Principal.java)

---

### 11. Calculate Game Duration ➕  
The program receives the start and end times of a game, each consisting of hour and minute values, and calculates the duration of the game in hours and minutes. It accounts for the possibility that the game may start on one day and end on the following day, with a maximum duration of 24 hours.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q11/src/br/edu/principal/Principal.java)

---

### 12. Calculate Salary Increase ➕  
The program receives the job code and the current salary of an employee, then displays the job title, the increase amount, and the new salary. The increase is based on the following table:  
- Code 1: Escriturário (50% increase)  
- Code 2: Secretário (35% increase)  
- Code 3: Caixa (20% increase)  
- Code 4: Gerente (10% increase)  
- Code 5: Diretor (no increase)  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q12/src/br/edu/principal/Principal.java)

---

### 13. Menu for Salary Operations ➕  
The program presents a menu with three options:  
1. **Tax Calculation**: Receives the salary of an employee, calculates, and shows the tax based on the following rules:  
   - Less than R$ 500.00: 5%  
   - R$ 500.00 to R$ 850.00 (inclusive): 10%  
   - Above R$ 850.00: 15%  
2. **New Salary Calculation**: Receives the salary, calculates, and shows the new salary based on the following rules:  
   - Above R$ 1,500.00: R$ 25.00 increase  
   - R$ 750.00 to R$ 1,500.00 (inclusive): R$ 50.00 increase  
   - R$ 450.00 to R$ 750.00 (inclusive): R$ 75.00 increase  
   - Below R$ 450.00: R$ 100.00 increase  
3. **Classification**: Receives the salary and displays the classification based on:  
   - Up to R$ 700.00 (inclusive): "Mal remunerado"  
   - Above R$ 700.00: "Bem remunerado"  
The program checks for invalid options and handles the necessary calculations accordingly.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q13/src/br/edu/principal/Principal.java)

---

### 14. Calculate Salary with Bonus and School Assistance ➕  
The program receives the initial salary of an employee, calculates and shows the new salary, including the bonus and school assistance based on the following rules:  
- **Bonus**:  
   - Up to R$ 500.00: 5% of the salary  
   - Between R$ 500.00 and R$ 1,200.00: 12% of the salary  
   - Above R$ 1,200.00: No bonus  
- **School Assistance**:  
   - Up to R$ 600.00: R$ 150.00  
   - Above R$ 600.00: R$ 100.00  
The program calculates the total amount of the bonus and school assistance and displays the final salary.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q14/src/br/edu/principal/Principal.java)

---

### 15. Calculate Employee Salary with Bonuses, Taxes, and Deductions ➕  
The program receives the minimum wage value, the number of hours worked, the number of dependents, and the number of overtime hours worked. It calculates the salary as follows:  
- The hourly rate is 1/5 of the minimum wage.  
- The monthly salary is the number of hours worked multiplied by the hourly rate.  
- For each dependent, an additional R$ 32.00 is added.  
- For each overtime hour worked, the hourly rate is increased by 50%.  
- The gross salary is the sum of the monthly salary, the value for dependents, and the overtime hours.  
- The income tax (IRRF) is deducted from the gross salary based on the following table:  
  - Exempt for salaries under R$ 200.00  
  - 10% for salaries between R$ 200.00 and R$ 500.00  
  - 20% for salaries above R$ 500.00  
- The net salary is the gross salary minus the IRRF.  
- The bonus is determined based on the net salary:  
  - R$ 100.00 for net salaries up to R$ 350.00  
  - R$ 50.00 for net salaries above R$ 350.00  
- The final salary is the net salary plus the bonus.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q15/src/br/edu/principal/Principal.java)

---

### 16. Price Adjustment for Products ➕  
The program receives the current price and the average monthly sales of a product and adjusts the price based on the following criteria:  
- If the **average monthly sales** is less than 500 and the **current price** is less than R$ 30.00, the price is increased by 10%.  
- If the **average monthly sales** is between 500 and 1,200, and the **current price** is between R$ 30.00 and R$ 80.00, the price is increased by 15%.  
- If the **average monthly sales** is greater than or equal to 1,200 and the **current price** is greater than or equal to R$ 80.00, the price is reduced by 20%.  
The program calculates and displays the new price after applying the respective increase or decrease.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q16/src/br/edu/principal/Principal.java)

--- 

### 17. Solve Quadratic Equations ➕  
The program solves quadratic equations of the form \( ax^2 + bx + c = 0 \) by calculating the discriminant (\( \Delta \)) and determining the roots based on the following conditions:  
- If \( \Delta > 0 \), there are two distinct real roots.  
- If \( \Delta = 0 \), there is one real root (a repeated root).  
- If \( \Delta < 0 \), there are no real roots (complex roots).  
The program receives the values of \( a \), \( b \), and \( c \), calculates the discriminant, and displays the roots if they exist.  
[View Code](https://github.com/MaxwellMaciel/CTI-P4-POO-20242-LISTA04/blob/main/CAP04/Q17/src/br/edu/principal/Principal.java)

---
