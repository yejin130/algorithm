package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_ºÐÇØÇÕ_2231 {

	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		int i = 1;
		int result = 0;
		while(true) {
			int sum = 0;
			i++;

			String st = Integer.toString(i);
			char[] ch = st.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				sum = sum + Character.getNumericValue(ch[j]);
			}
			sum = sum + i;

			if (sum == N) {
				result = i;
				break;
			}
			if(i>1000000)break;
		}
		System.out.println(result);

	}
}
