package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_스택수열_1874 {
	static int N;

	static int[] arr;
	static boolean[] check_stack; // 스택으로 push 되어있는지
	static boolean[] check_ans; // 스택에서 pop 돼서 수열로 완성되었는지

	static Stack<Integer> s = new Stack<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1];
		check_stack = new boolean[N + 1];
		check_ans = new boolean[N + 1];

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int i = 1;
		int j = 1;
		while(arr[j] != i) {
			s.push(i);
			i++;
			sb.append("+");
		}
		if(arr[j] == s.peek()) {
			s.pop();
		}
		

		if (!s.empty()) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}

	}
}
