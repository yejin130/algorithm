package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_¿œ∞ˆ≥≠¿Ô¿Ã_2309 {

	static boolean flag;
	static int[] src = new int[9];
	static int[] tgt = new int[7];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0;i < 9;i++) {			
			src[i] = Integer.parseInt(br.readLine());
		}
		
		comb(0,0);
	}
	static void comb(int tgtIdx, int srcIdx) {
		if(tgtIdx == 7) {
			int sum=0;
			for(int i = 0;i < 7;i++) {
				sum += tgt[i];
			}
			if(sum == 100) {
				Arrays.sort(tgt);
				
				for(int i = 0;i < 7;i++) {
					System.out.println(tgt[i]);
				}
				flag = true;
				
			}
			return;
		}
		
		if(srcIdx == 9) {
			return;
		}
		
		if(flag) {
			return;
		}
		
		
		
		tgt[tgtIdx] = src[srcIdx];
		
		comb(tgtIdx + 1, srcIdx + 1);
		comb(tgtIdx, srcIdx + 1);	
	
	}
}
