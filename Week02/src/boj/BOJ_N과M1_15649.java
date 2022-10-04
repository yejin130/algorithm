package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_N°úM1_15649 {
	static int N;
	static int M;
	
	static int[] src;
	static int[] tgt;
	
	static boolean[] select;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		src = new int[N];
		tgt = new int[M];
		
		select = new boolean[N];

		for(int i=0;i<N;i++) {
			src[i] = i+1;
		}
			
		perm(0);
		
	}
	
	static void perm(int tgtIdx) {
		if(tgtIdx == M) {
			for(int i = 0; i < M;i++) {
				System.out.print(tgt[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(select[i])continue;
			
			select[i] = true;
			tgt[tgtIdx] = src[i];
			perm(tgtIdx + 1);
			select[i] = false;
		}
	}
	
}
