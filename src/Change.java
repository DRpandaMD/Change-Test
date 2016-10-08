import java.util.Scanner;
import java.math.*;

public class Change 
{
	private static Scanner scan;

	public static void main(String[] args)
	{
	   scan = new Scanner(System.in);
	   double cost, paidAmount;
	   //int dollars = 0, quarters = 0, dimes = 0, nickles = 0, pennies =0 ;
	   System.out.println("Please enter the cost:");
	   cost = scan.nextDouble();
	   System.out.println("Please enter the paid amount:");
	   paidAmount = scan.nextDouble();

	  int[] x = changeCalc(paidAmount, cost);
	  for(int i = 0 ; i < 5 ; i++)
	  {
		  System.out.println(x[i]);
	  }
	}

	public static int[] changeCalc(double paid, double cost)
	{
		/*
		 * There is a rounding issue with the doubles
		 * You need to round up the nearest whole penny
		 *	
		 */
		 int change = (int) Math.round(((paid - cost) * 100.0));
		 int dollars = 0, quarters = 0, dimes = 0, nickles = 0, pennies = 0;
		 int[] changes = new int[5];
		 
		 if(change > 0)
		 {
			dollars = change / 100;
			changes[0] = dollars;
		
			change = change % 100;
	
			quarters = change / 25;
			changes[1] = quarters;
	
			change = change % 25;
	
			dimes = change / 10;
	       	changes[2] = dimes;
	
	       	change = change % 10;
	
	       	nickles = change/5;
	
	       	changes[3] = nickles;
	
	       	pennies = change % 5;
	       	changes[4] = pennies;
	
		 }	
		 return changes;
	}

}