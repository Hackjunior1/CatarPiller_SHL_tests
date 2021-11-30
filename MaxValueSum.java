package Catarpiller_SHL;

public class MaxValueSum {

	public static void main(String[] args) {
		int elements[] = { 9, -100, 1, 0, -4, 15, 50 };
		int result = sumoftwolements(elements);
		System.out.println("The Sum of two elements is : " + result);
	}

	public static int sumoftwolements(int elements[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		for (int value : elements) {
			if (value > max) {
				secondMax = max;
				max = value;
			} else if (value > secondMax && value < max) {
				secondMax = value;
			}
		}
		int sum = max + secondMax;
		return sum;
	}

}
