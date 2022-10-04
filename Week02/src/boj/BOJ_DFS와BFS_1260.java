package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_DFS와BFS_1260 {
	static int N, M, V;
	static int[][] arr;

	static boolean[] check;
	static Queue<Integer> q = new ArrayDeque<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호 V

		arr = new int[N + 1][N + 1];

		check = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st2.nextToken());
			int w = Integer.parseInt(st2.nextToken());

			arr[v][w] = 1;
			arr[w][v] = 1;
		}

		dfs(V);
		System.out.println();
		check = new boolean[N + 1];

		bfs();
	}

	static void dfs(int n) {
		System.out.print(n + " ");

		check[n] = true;
		int cur = n;

		for (int i = 0; i < N + 1; i++) {
			if (arr[cur][i] == 1 && !check[i]) {
				check[i] = true;
				dfs(i);
			}
		}
	}

	static void bfs() {
		check[V] = true;
		q.add(V);

		while (!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur + " ");
			for (int i = 0; i < N + 1; i++) {
				if (arr[cur][i] == 1 && !check[i]) {
					check[i] = true;
					q.add(i);
				}
			}
		}

	}

}
