package calculatorP;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter an Integer");
		Scanner input = new Scanner(System.in);
		x=input.nextInt();
		if(x%2==0)
			System.out.println("the no.is even");
		else
			System.out.println("Odd");
		
	}

}
