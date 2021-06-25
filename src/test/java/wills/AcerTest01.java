package wills;

import java.util.Scanner;

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
		System.out.println("請輸入自訂參數：");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			getStringAllSumFun(i);
		}
	}
}
