package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_�׷�ܾ�üĿ_1316 {

	static int N;
	static char[] arr;
	static boolean[] check;

	static boolean[] ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		ans = new boolean[N];

		// �Ѱ� �ܾ� ����
		for (int i = 0; i < N; i++) {
			check = new boolean[26];

			String s = br.readLine();
			arr = s.toCharArray();

			// �ܾ� �ѱ��ھ� ����
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
