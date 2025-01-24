package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// fibonacci series - logic - sum of last 2 no's
		//if n=8 ,n1=0,n2=1= i print 0 first then 0+1=1 next 0,1 =1 
		//next 0,1,1 = 1+1=2 next 0,1,1,2=2+1=3 next 0,1,1,2,3=2+3=5 till 8
		
		int n=8,n1=0,n2=1;
		System.out.println("Fibonacci Series till "+n+" terms :");
 for (int i = 0; i < n; i++) 
 {
System.out.println(n1 + " ");	

int n3=n1+n2;
n1=n2;
n2=n3;
 }
	}

}
