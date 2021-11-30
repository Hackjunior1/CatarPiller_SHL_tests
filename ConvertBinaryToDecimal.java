package Catarpiller_SHL;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

	public void getDeciaml(int binary) {
		//System.out.println("in the get decimal method");
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				//System.out.println("Please read the Binary Number First");
				break;
			} 
			else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		System.out.println("the decimalvalue is " + decimal);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Read the binary Number");
		int bin = scan.nextInt();
		ConvertBinaryToDecimal cbtd = new ConvertBinaryToDecimal();
		cbtd.getDeciaml(bin);
		// scan.close();

	}

}
