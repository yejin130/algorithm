package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_���ڿ��ݺ�_2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			char[] input = br.readLine().toCharArray();
			int R = Character.getNumericValue(input[0]);

			for (int j = 2; j < input.length; j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(input[j]);
				}
			}
			System.out.println();
		}

	}

}
