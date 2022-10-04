package boj;

import java.util.Arrays;

public class Combination {
	// 조합, 5C3 => 5개 중에 3개 뽑기 
	static int[] src = { 0, 1, 2, 3, 4};
	static int[] tgt = new int[3];
	
	static int COUNT;
	
	public static void main(String[] args) {
		comb(0,0);
		
		System.out.println(COUNT);
	}
	
	static void comb(int tgtIdx, int srcIdx) {
		if(tgtIdx == 3) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}
		
		if(srcIdx == 5) {
			return;
		}
		
		tgt[tgtIdx] = src[srcIdx];
		
		comb(tgtIdx + 1, srcIdx + 1);
		comb(tgtIdx, srcIdx + 1);	
	}
}
