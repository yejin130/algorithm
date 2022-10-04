package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_∫Ì∑¢¿Ë_2798 {

	static int N;
	static int M;

	static int[] src;
	static int[] tgt = new int[3];

	static int sum_result = 0;
	static int sum_now = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		src = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			src[i] = Integer.parseInt(st2.nextToken());
		}

		comb(0, 0);
		System.out.println(sum_result);
	}

	static void comb(int tgtIdx, int srcIdx) {
		if (tgtIdx == 3) {
			sum_now = tgt[0] + tgt[1] + tgt[2];
			if (sum_now <= M && sum_now > sum_result) {
				sum_result = sum_now;
			}
			return;
		}
		if (srcIdx == N) {
			return;
		}

		tgt[tgtIdx] = src[srcIdx];
		comb(tgtIdx + 1, srcIdx + 1);
		comb(tgtIdx, srcIdx + 1);

	}
}
