package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_모든순열_10974 {
	static int N;
	
	static int[] src;
	static int[] tgt;
	
	static boolean[] select;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		src = new int[N];
		tgt = new int[N];
		select = new boolean[N];
		
		for(int i = 0 ; i < N ; i++) {
			src[i] = i+1;
		}
		perm(0);
	}
	
	static void perm(int tgtIdx) {
		if(tgtIdx == N) {
			
			for(int i = 0 ; i < N ; i++) {
				System.out.print(tgt[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 0 ; i < N ; i++) {
			if (select[i]) continue;
			
			select[i] = true;
			tgt[tgtIdx] = src[i];
			perm(tgtIdx + 1);
			select[i] = false;
		}
		
	}
}
