package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=15;
		boolean flag=false;
		int i;
		
		for (i=2; i<=input/2; i++)
		{
			if ( input%i==0) {
				flag=true;	
		}
			
		}
		if (flag==true) {
			System.out.println("This is not prime number");}
			else
				System.out.println("This is prime number");
		}
			

	}

