package corejava;

import java.util.Scanner;

public class TestEvenOdd {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);

		while(true)
		{
                   System.out.println("Enter the number");
                   int number=scanner.nextInt();

			if(number<0)
			{
				break;
			}
			if(number%2==0)
			{
				System.out.println(number+" is Even");
			}
			else
			{
				System.out.println(number+" is Odd");
			}
		}
		System.out.println("End of loop");
	}

}