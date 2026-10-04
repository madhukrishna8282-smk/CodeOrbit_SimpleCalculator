package codeorbit_simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
    	//Create Scanner to read input from the user
         Scanner sc = new Scanner(System.in);

        try {
        	//Read the first number
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            //Read the second number

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            //Read the arithmetic operator

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;
            //perform selected operation

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                	//prevent division by zero
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator!");
                    return;
            }
            //display the result
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
