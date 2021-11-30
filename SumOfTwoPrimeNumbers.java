package Catarpiller_SHL;

import java.util.Scanner;

public class SumOfTwoPrimeNumbers {
	public void primenumbercount(int num) {
		int  res = 0;
		int n=num;
		int sum=0;
		while (n > 0) {
			res = n % 10;
			int count=0;
			for(int i=1;i<res;i++) {
				if(res%i==0) {
					count++;
					//break;
				}
			}
			if(count==1) {
				System.out.println(res+" is prime");
				sum=sum+res;	
			}
			n=n/10;
		}
		System.out.println(sum);	
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("read n value");
		int n = s.nextInt();
		SumOfTwoPrimeNumbers  stpn=new SumOfTwoPrimeNumbers();
		stpn.primenumbercount(n);
		s.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

