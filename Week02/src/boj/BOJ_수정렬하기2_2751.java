package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_�������ϱ�2_2751 {
	//sort�� �ϴϱ� �ð��ʰ� 
	//����Ҷ� StringBuilder���ٰ� ���� �ϳ��� append�ϰ� �������� stringbuilder �ϳ��� system out���� ����غ���?
	static int N;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);

	}
}
//
//2.���䳪 
//3.