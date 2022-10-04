package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_바이러스_2606_bfs1 {
	
	static int N, M, ans;
	static int[][] virus;
	
	static Queue<Integer> q = new ArrayDeque<>();
	static boolean[] checked;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		virus = new int[N + 1][N + 1];
		checked = new boolean[N + 1];
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			virus[v][w] = 1;
			virus[w][v] = 1;
		}
		
		bfs();
		
		for (int i = 1; i <= N; i++) {
			if (checked[i]) ans++;
		}
		
		System.out.println(ans - 1);
	}
	
	static void bfs() {
		checked[1] = true;
		q.add(1);
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			
			for (int i = 1; i <= N; i++) {
				if (virus[cur][i] == 1 && !checked[i]) {
					checked[i] = true;
					q.add(i);
				}
			}
		}
	}
}
