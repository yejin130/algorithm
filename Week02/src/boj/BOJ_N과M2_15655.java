package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_N과M2_15655 {
	// 다 보고 풀었음 ㅜㅜ start 
	static int N;
	static int M;
		
	static int[] src;
	static int[] tgt;
	static boolean[] select;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		src = new int [N];
		tgt = new int [M];

		select = new boolean [N];

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			src[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(src);
		
		perm(0,0);
	}
	
	static void perm(int start, int tgtIdx) {
		if(tgtIdx == M) {
			
			for(int i = 0; i < M; i++) {
				System.out.print(tgt[i] + " ");					
			}
			
			System.out.println();
			return;
		}
		
		for(int i = start; i < N; i++) {
			if(select[i]) continue;

			select[i] = true;
			tgt[tgtIdx] = src[i];				
			perm(i + 1, tgtIdx + 1);
			select[i] = false;
		}		
	}
}
