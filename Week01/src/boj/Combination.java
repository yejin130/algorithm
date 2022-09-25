package boj;

import java.util.Arrays;

public class Combination {
	
	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];
	
	static int COUNT;
	
	// 5C2 => 5 * 4 / 2 * 1
	
	public static void main(String[] args) {
		comb(0, 0);
		
		System.out.println(COUNT);
	}
	
	static void comb(int tgtIdx, int srcIdx) {
		if (tgtIdx == 3) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			
			return;
		}
		
		if (srcIdx == 5) {
			return;
		}
		
		tgt[tgtIdx] = src[srcIdx];
		
		comb(tgtIdx + 1, srcIdx + 1);
		comb(tgtIdx, srcIdx + 1);
	}
}
