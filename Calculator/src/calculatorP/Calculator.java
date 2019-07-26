package calculatorP;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		double x, y;
			Scanner scanner= new Scanner(System.in);
		System.out.print("Enter first Number:");
		x = scanner.nextDouble();
		System.out.print("Enter second number");
		y = scanner.nextDouble();
			System.out.println("Enter the operator(+,-,*,/):");
		char operator = scanner.next().charAt(0);
		scanner.close();
		double output;
		switch (operator)
		{
			case '+':
				output= x+y;
				break;
			case '-':
				output= x-y;
				break;
			case '*':
				output= x*y;
				break;
			case '/':
				output= x/y;
				break;
				default:
					System.out.printf("You have entered wrong operator");
					return;
        }
		System.out.println(x+""+operator+""+y+":"+output);
				
				
				
		}
	}


