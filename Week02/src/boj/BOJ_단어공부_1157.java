package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_단어공부_1157 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();

		int[] input_int = new int[input.length];

		int[] char_count = new int[26];

		for (int i = 0; i < input.length; i++) {
			input_int[i] = input[i];

			if (input_int[i] > 90) {
				input_int[i] -= 32;
			}
			char_count[input_int[i] - 65]++;
		}

		int max = 0;
		char max_char = '?';

		for (int i = 0; i < 26; i++) {
			if (max < char_count[i]) {
				max = char_count[i];
				max_char = (char) (i + 65);
			} else if (max == char_count[i])
				max_char = '?';
		}
		System.out.println(max_char);
	}
}
//		
//		for (int i = 0; i < s.length(); i++) {
//			arr_int[i] = arr_ch[i];
//			if (arr_int[i] > 90) {
//				arr_int[i] -= 32;
//			}
//			arr_result[arr_int[i] - 65] += 1;
//		}
//
//		int n = 0;
//		for (int i = 0; i < 26; i++) {
//			if (arr_result[i] > MAX) {
//				MAX = arr_result[i];
//				n = i + 65;
//				MAX_val = (char) n;
//			}
//		}
//		for (int i = 0; i < 26; i++) {
//			if (i == n - 65)
//				continue;
//			else if (arr_result[i] == MAX)
//				MAX_val = '?';
//		}
//		System.out.println(MAX_val);
//
//	}