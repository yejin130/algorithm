package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_정수N개의합_15596 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = st.countTokens();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(sum(a));

	}

	static long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
        
        return ans;
    }
}
