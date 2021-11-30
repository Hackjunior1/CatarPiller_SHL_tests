package Catarpiller_SHL;

import java.util.Scanner;

public class perfectSquareCustBill {

	public int checkDiscounts(int[] billamount) {
		int count = 0;
		for (int i = 0; i < billamount.length; i++) {
			float num = (float) Math.sqrt(billamount[i]);
			float check_num = (num * 10);
			if ((check_num % 10) == 0) {
				System.out.println("The numbers of billamount to avail Discount are : " + billamount[i]);
				count++;
			}

		}
		return count;

	}

	public static void main(String args[]) {
		/*
		 * Scanner sc = new Scanner(System.in); int da=0;
		 * System.out.print("Enter the number list to avail Discount offer: ");
		 * da=sc.nextInt();
		 */

		int billamount[] = { 25, 77, 54, 81, 48, 34 };
		perfectSquareCustBill ps = new perfectSquareCustBill();

		/*
		 * System.out.println("The bill amounts are: "); for(int i=0; i<da; i++) {
		 * billamount[i]=sc.nextInt(); }
		 */
		int result = ps.checkDiscounts(billamount);
		System.out.println("number of Perfect Square numbers are "+result);
	}

}
