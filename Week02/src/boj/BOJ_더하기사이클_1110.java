package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_더하기사이클_1110 {

	// 메모리 초과
	// String을 쓰지말고 Int 숫자 자체로 %랑 /를 사용해서

	static int N;
	static int COUNT = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int i=N;
		while(true) {
			func(N);
			COUNT++;
			if(N==i) {break;}
		}
		
		System.out.println(COUNT);
	}

	static void func(int input) {
		int left = 0, right = 0;
		int output = 0;

		if ((input / 10) > 0) { // 두자리수임
			right = input % 10;
			left = input / 10;
		} else if((input / 10) == 0) { // 한자리수임
			left = 0;
			right = input % 10;
		}
		int sum = left + right;

		if ((sum / 10) > 0) { // 두자리수임
			output = sum % 10 + right*10;
		} else if((sum / 10) == 0) { // 한자리수임
			output = sum + right*10;
		}
		N = output;
		return;
	}

}