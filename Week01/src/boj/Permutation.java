package boj;

import java.util.Arrays;

// ����(5P3 => 5�� �߿��� 3���� �̾Ƽ� �ټ���� ����� ��), ����(5C3 => 5�� �߿��� 3���� �̴� ����� ��), �κ�����
// ����
public class Permutation {

	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];
	// { ?, ?, ? }
	
	static boolean[] select = new boolean[src.length];
	
	static int COUNT;
	public static void main(String[] args) {
		perm(0);
		
		System.out.println(COUNT);
	}
	static void perm(int tgtIdx) {
		if (tgtIdx == 3) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			
			return;
		}
		
		for (int i = 0; i < src.length; i++) {
			if (select[i]) continue;
			
			select[i] = true;
			tgt[tgtIdx] = src[i];
			perm(tgtIdx + 1);
			select[i] = false;
		}
	}
}