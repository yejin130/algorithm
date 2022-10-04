package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_Ω∫≈√_10828 {

	static Stack<Integer> s = new Stack<>();
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String first = st.nextToken();

			if (first.equals("push")) {
				s.push(Integer.parseInt(st.nextToken()));
			} else if (first.equals("pop")) {
				if (s.empty() == true) {
					System.out.println("-1");
				} else {
					System.out.println(s.pop());
				}
			} else if (first.equals("size")) {
				System.out.println(s.size());
			} else if (first.equals("empty")) {
				if (s.empty() == true) {
					System.out.println("1");
				} else
					System.out.println("0");
			} else if (first.equals("top")) {
				if (s.empty() == true) {
					System.out.println("-1");
				} else {
					System.out.println(s.peek());
				}
			}
		}
	}
}
