package Catarpiller_SHL;

import java.util.Scanner;

public class addOddnumCustomerBillDiscount {

	public int calculateDiscount(int billAmount) {
		int sum = 0;
		while (billAmount > 0) {
			int rem = billAmount % 10;
			
			if (rem % 2 != 0) {
				sum += rem;
			}
			billAmount = billAmount / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("read a bill amount");
		int billAmount = sc.nextInt();

		addOddnumCustomerBillDiscount cbd = new addOddnumCustomerBillDiscount();
		int result = cbd.calculateDiscount(billAmount);
		System.out.print(result);
	}
}
