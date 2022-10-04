package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_디지털티비_2816번 {
	static int N;

	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
        ArrayList<String> src = new ArrayList<String>();
		for(int i=0;i<N;i++) {
			src.add(br.readLine());
		}
		
		int num = src.indexOf("KBS1");
		if(num != 0) {
			for(int i=0;i<num;i++) {
				System.out.print("1");
			}
			for(int i=0;i<num;i++) {
				System.out.print("4");
			}
		}
		
		num = src.indexOf("KBS2");
		if(num != 1) {
			for(int i=0;i<num;i++) {
				System.out.print("1");
			}
			for(int i=0;i<num-1;i++) {
				System.out.print("4");
			}
		}
		
	}
}
