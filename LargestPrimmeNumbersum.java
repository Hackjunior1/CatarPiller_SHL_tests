package Catarpiller_SHL;

public class LargestPrimmeNumbersum {

	public static void main(String args[]) {
		int count, sum = 0, k = 0;
		

		for (int number = 1; number <= 50; number++) {
			count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				if (number > 45 && number < 50) {
					//System.out.println(number);
					k = number;
					//here -97 is fixed value. now we have to check for the highest prime number that will occue below 50.
					//that means the highest prime number tha is below is 47. we are asigning it to k and adding to -97.
					k = k - 97;

				}

			}
		}
		 System.out.println("The Sum of Prime Numbers are: " +k);
	}
}
