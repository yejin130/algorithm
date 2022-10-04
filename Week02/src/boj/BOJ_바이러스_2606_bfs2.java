package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_바이러스_2606_bfs2 {
	static int N, M;

	static int[][] arr;
	static Queue<Integer> q = new ArrayDeque<>();

	static boolean[] check;
	static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		arr = new int[N + 1][N + 1];
		check = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			arr[v][w] = 1;
			arr[w][v] = 1;
		}
//		for(int i=0;i<N+1;i++) {
//			for(int j=0;j<N+1;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

		bfs();

		for (int i = 0; i < N + 1; i++) {
			if (check[i] == true)
				ans++;
		}
		System.out.println(ans - 1);
	}

	static void bfs() {
		check[1] = true;
		
		q.add(1);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			
			for(int j=0;j<=N;j++) {
				if(arr[cur][j] == 1 && !check[j]) {
					q.add(j);
					check[j] = true;
				}
				
			}
			
		}
		
		
		
		
		
		
	}
}
