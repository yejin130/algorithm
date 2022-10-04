package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_ÇÑ¼ö_1065 {
	static int N;
	static int COUNT;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		boolean[] arr = new boolean[1000];
		for (int i = 0; i < N; i++) {
			if (func(i + 1) == true)
				COUNT++;
		}
		System.out.println(COUNT);
//		System.out.println(func(7531));
	}

	static boolean func(int input) {
		if (input >= 1 && input <= 99)
			return true;

		int num;
		int diff;

		num = input % 10;
		input = input / 10;
//		System.out.println(input + "," + num);

		diff = num - (input % 10);
		num = input % 10;
		input = input / 10;
//		System.out.println(input + "," + num + "," + diff);

		while (input > 0) {
			if (diff != num - (input % 10))
				return false;
			else {
				diff = num - (input % 10);
				num = input % 10;
				input = input / 10;

//				System.out.println(input + "," + num + "," + diff);
			}
		}
		return true;

	}
}
