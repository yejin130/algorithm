package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_괄호_9012 {
	static int T;
	static char[] input_arr;
	static String[] ans_arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		ans_arr = new String[T];

		// 한 단어 시작
		for (int i = 0; i < T; i++) {
			Stack<Character> s = new Stack<>();

			String input = br.readLine();
			input_arr = input.toCharArray();

			// 한 글자씩 체크
			for (int j = 0; j < input.length(); j++) {
				char cur = input_arr[j];

				if (cur == '(') {
					s.push(cur);
				} else if (cur == ')') {
					if (s.empty() != true && s.peek() == '(') {
						s.pop();
						continue;
					} else {
						s.push(cur);
						ans_arr[i] = "NO";
					}
				}
			}

			if (s.empty())
				ans_arr[i] = "YES";
			else if (!s.empty())
				ans_arr[i] = "NO";
		}

		for (int i = 0; i < T; i++) {
			System.out.println(ans_arr[i]);
		}

	}
}