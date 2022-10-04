package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_±ÕÇüÀâÈù¼¼»ó_4949 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String s = br.readLine();
			
			if (s.equals(".")) {
				break;
			} else {
				func(s);
			}
			
		}
	}

	static void func(String s) {
		char[] line = s.toCharArray();

		Stack<Character> stack = new Stack<>();
		String ans = null;

		for (int i = 0; i < line.length; i++) {
			char cur = line[i];

			if (cur == '(' || cur == '[') {
				stack.push(cur);
			} else if (cur == ')') {
				if (!stack.empty() && stack.peek() == '(') {
					stack.pop();
					continue;
				} else {
					stack.push(cur);
					ans = "no";
					break;
				}
			} else if (cur == ']') {
				if (!stack.empty() && stack.peek() == '[') {
					stack.pop();
					continue;
				} else {
					stack.push(cur);
					ans = "no";
					break;
				}
			}
		}

		if (stack.empty())
			ans = "yes";
		else 
			ans = "no";

		System.out.println(ans);
	}
}
