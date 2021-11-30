package Catarpiller_SHL;

import java.util.Scanner;

public class ConvertDecimalToBinary {
	
	public int getBinary(int num)
	{
	int answer=0;
	int cnt=0;
	while(num!=0){
	int rem=num % 2;
	double c=Math.pow(10, cnt);
	answer+=rem*c;
	num/=2;
	cnt++;
	}

	return answer;
	}
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer:");
	int num = in.nextInt();
	ConvertDecimalToBinary dtb=new ConvertDecimalToBinary();
	int result = dtb.getBinary(num);
	System.out.print(result);
	}
	}


