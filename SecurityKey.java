package Catarpiller_SHL;

public class SecurityKey {

	public  int countRepeatingDigits(int num) {
		int res = 0;
		int cnt[] = new int[10];
		while (num > 0) {
			int rem = num % 10;
			cnt[rem]++;
			num = num / 10;
		}
		for (int i = 0; i < 10; i++) {
			if (cnt[i] > 1) {
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int Skey = 578378923;
		SecurityKey sk=new SecurityKey();
		System.out.println(sk.countRepeatingDigits(Skey));
	}
}
