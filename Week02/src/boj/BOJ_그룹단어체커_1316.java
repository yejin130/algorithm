package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_그룹단어체커_1316 {

	static int N;
	static char[] arr;
	static boolean[] check;

	static boolean[] ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		ans = new boolean[N];

		// 한개 단어 시작
		for (int i = 0; i < N; i++) {
			check = new boolean[26];

			String s = br.readLine();
			arr = s.toCharArray();

			// 단어 한글자씩 시작
			for (int j = 0; j < s.length(); j++) {
				int asc = arr[j];
				asc -= 97;
				if (j == 0) {
					check[asc] = true;
				} else if (arr[j - 1] == arr[j]) {
					continue;
				} else if (arr[j - 1] != arr[j]) {
					if (check[asc]) {
						ans[i] = false;
						break;
					} else {
						check[asc] = true;
					}
				}
				ans[i] = true;
			}
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			if (ans[i] == true) {
				count++;
			}
		}
		System.out.println(count);
	}
}
