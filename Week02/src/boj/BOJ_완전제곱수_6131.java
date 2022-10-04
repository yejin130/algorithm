package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_완전제곱수_6131 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count=0;

		for (int i = 1; i < 501; i++) {
			for (int j = 1; j < 501; j++) {
				if (i*i - j*j == N) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
