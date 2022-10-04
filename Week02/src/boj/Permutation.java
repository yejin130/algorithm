package boj;

import java.util.Arrays;

//순열 5P3 => 5개 중에 3개를 뽑아서 순서대로 정렬
public class Permutation {
	static int count=0;
	static int[] src = {0, 1, 2};
	static int[] tgt = new int[2];
	
	static boolean[] select = new boolean[3];
	
	public static void main(String[] args) {
		perm(0);
	}
	
	static void perm(int tgtIdx) {
		if(tgtIdx == 2 && tgt[0]!=src[3-1]) {
			System.out.println(Arrays.toString(tgt));
			System.out.println("-------check------\ntgtIdx: perm("+ tgtIdx +")\nselect_arr: " + Arrays.toString(select)+ "\ntgt_arr: " + Arrays.toString(tgt)+"\n------------------\n");

			return;
		}
		
		for(int i = 0; i < 3; i++) {
			if(select[i] || i<tgtIdx) continue;
			
			select[i] = true;
			tgt[tgtIdx] = src[i];
			perm(tgtIdx + 1);
			select[i] = false;			

			count++;

		}
	}
	
}
