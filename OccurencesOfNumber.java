package Catarpiller_SHL;

import java.util.Scanner;

public class OccurencesOfNumber {
	public int occurenceOfNumber(int data, int digit) {
		int answer = 0;
		int num = 0;
		while (data > 0) {
			num = data % 10;
			if (num == digit) {
				answer = answer + 1;
			}
			data = data / 10;

		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the list Numbers to check repetation:");
		int data = s.nextInt();
		System.out.println("Enter the Target number to check for Occurence: ");
		int digit = s.nextInt();
		OccurencesOfNumber ocn = new OccurencesOfNumber();
		int result = ocn.occurenceOfNumber(data, digit);
		System.out.println("Total number of "+digit+" 's are "+ result);
	}



}
