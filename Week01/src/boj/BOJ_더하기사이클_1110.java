package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import sun.security.util.Length;

public class BOJ_더하기사이클_1110 {
	static int N;
	static int result;
	static int COUNT;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		while(true) {
			sum(N);
			if(result == N) { 
				System.out.println(COUNT);
				break;
			}
		}
		
	}
	
	static int sum(int input_int) {
		COUNT++;
		
		int_to_string(input_int);
		String [] arr1;
		String [] arr2;
		arr1 = int_to_string(input_int);
		
		int sum = Integer.parseInt(arr1[0]) + Integer.parseInt(arr1[1]);
		
		arr2 = int_to_string(sum);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr1[1]);
		sb.append(arr2[1]);
		String s = sb.toString();
		
		System.out.println(Integer.parseInt(s));
		
		return Integer.parseInt(arr1[1] + arr2[1]);		
	}
	static String[] int_to_string(int input_int) {
		String input_s = String.valueOf(input_int);

		String [] arr = new String[2];
		String left = null, right = null;

		arr = input_s.split("");
		
		if(input_s.length() == 1) {
			left = "0";
			right = arr[0];
		}else if(input_s.length() == 2) {
			left = arr[0];
			right = arr[1];
		}
		
		arr[0] = left;
		arr[1] = right;
		
		System.out.println(arr[0]+"a"+arr[1]);
		return arr;
		
	}
}