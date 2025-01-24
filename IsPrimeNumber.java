package week1.day2;

import java.util.Iterator;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// prime nos - divisible only by itself
		//num=10 i=2 10%2=5
		
		int num=11;
		boolean isPrime=true;
		for (int i = 2; i <=num/2; i++) {
			
			if (num%i==0) 
			{
			  isPrime=false;
			  break;
			}
		}

		if (isPrime && num>1)
		{
		  System.out.println(num +" is a Prime Number");	
		}
		else {
			System.out.println(num + " is not a Prime Number");
		}
	}

}
