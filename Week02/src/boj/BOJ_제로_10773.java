package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Á¦·Î_10773 {
	static int K;
	static int sum = 0;

	static Stack<Integer> s = new Stack<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input != 0) {
				s.push(input);
			} else if (input == 0 && !s.empty()) {
				s.pop();
			}
		}

		while(!s.empty()) {
			sum += s.pop();
		}

		System.out.println(sum);
	}
}
