package Catarpiller_SHL;

import java.util.Scanner;

public class countConsonents {
//my one more question is  it counts how many consonants in given input
	//for example input-avanthika output -5 ,input-ammu output-2
	
	public void countConsonents(String str) {
		int vCount = 0, cCount = 0;
		//String str = "suresh";
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
			{

				vCount++;
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
			{

				cCount++;
			}
		}
		System.out.println("Number of consonants in : "+str+" = " + cCount);
	}
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Read a String to count Number of Consonents");
		String str=scan.next();
		countConsonents cc=new countConsonents();
		cc.countConsonents(str);
		scan.close();
	}
}
