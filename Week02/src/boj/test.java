package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class test {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String s = br.readLine();

			if (s.equals(".")) {
				break;
			}
			sb.append(func(s)).append('\n');

		}

		System.out.println(sb);
	}

	static String func(String s) {
		char[] line = s.toCharArray();

		Stack<Character> stack = new Stack<>();
		String ans = null;

		for (int i = 0; i < line.length; i++) {
			char cur = line[i];

			if (cur == '(' || cur == '[') {
				stack.push(cur);
			} else if (cur == ')') {
				if (stack.empty() != true && stack.peek() == '(') {
					stack.pop();
					continue;
				} else {
					stack.push(cur);
					ans = "NO";
					break;
				}
			} else if (cur == ']') {
				if (stack.empty() != true && stack.peek() == '[') {
					stack.pop();
					continue;
				} else {
					stack.push(cur);
					ans = "NO";
					break;
				}
			}
		}

		if (stack.empty())
			ans = "YES";
		else if (!stack.empty())
			ans = "NO";

		return ans;
	}
}
