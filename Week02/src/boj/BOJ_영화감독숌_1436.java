package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_¿µÈ­°¨µ¶¼ò_1436 {

	static int N;
	static boolean[] src;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		src = new boolean[10000];
		int i = 665;
		int count = 0;
		int result = 0;

		while (true) {
			i++;
			if (Integer.toString(i).contains("666")) {
				count++;
				if (count == N) {
					result = i;
					break;
				}
			}
		}

		System.out.println(result);

	}
}
