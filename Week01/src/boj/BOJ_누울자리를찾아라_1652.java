package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_누울자리를찾아라_1652 {
	
	static int N;
	static char[][] map;
	static int hor_num, ver_num;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new char[N][];
		
		//"....." => { '.', '.', '.' ... }
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-1; j++) {
				if(map[i][j] == '.' && map[i][j+1] == '.' && (j + 2 >= N || map[i][j +2 ] == 'X')) {
					hor_num++;
					
				}
			}
		}
		
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N-1; i++) {
				if(map[i][j] == '.' && map[i+1][j] == '.' && (i + 2 >= N || map[i + 2][j] == 'X')) {
					ver_num++;
				}
			}
		}
		
		System.out.println(hor_num + " " + ver_num);
	}
}
