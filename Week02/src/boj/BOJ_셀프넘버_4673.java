package boj;

public class BOJ_¼¿ÇÁ³Ñ¹ö_4673 {
	static boolean[] arr = new boolean[10000];

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000; i++) {
			int n = d(i);
			if (n < 10000)
				arr[n] = true;

			if (arr[i] == false)
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

	static int d(int num) {
		int sum = num;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}

		return sum;
	}

}

//
//for (int i = 1; i < 10000; i++) {
//	int j = 0;
//	while (j < 10000) {
//		j++;
//		if (d(j) == i) {
//			break;
//		}
//	}
//	if(j==10000) sb.append(i).append("\n");
//}
//System.out.println(sb);