package wills;

public class AcerTest01 {

	public static void getStringAllSumFun(int n) {
		int num;
		int sum = 0;
		String str = "";
		for (int s = 0; s < n; s++) {
//			num = (2 ** (n - 1));
			num = (int) Math.pow(2, n - 1);
			str += ("+" + num);
			sum += num;
		}
		System.out.println(str.substring(1) + "=" + sum);
	}

	public static void main(String[] args) {
		int N = 4;
		for (int i = 1; i <= N; i++) {
			getStringAllSumFun(i);
		}
	}
}
