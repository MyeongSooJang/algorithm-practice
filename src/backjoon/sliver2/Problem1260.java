package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem1260 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static List<Integer> dfsResult = new ArrayList<>();
    static List<Integer> bfsResult = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int count = Integer.parseInt(inputs[0]);
        int test = Integer.parseInt(inputs[1]);
        int start = Integer.parseInt(inputs[2]);

        graph = new ArrayList[count + 1];
        visited = new boolean[count + 1];
        Arrays.setAll(graph, i -> new ArrayList<>());

        for (int i = 0; i < test; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        for (int i = 1; i <= count; i++) {
            graph[i].sort(null);
        }
        dfs(start);
        Arrays.fill(visited, false);
        bfs(start);
        for (int i = 0; i < dfsResult.size(); i++) {
            bw.write(dfsResult.get(i) + " ");
        }
        bw.write("\n");
        for (int i = 0; i < bfsResult.size(); i++) {
            bw.write(bfsResult.get(i) + " ");
        }

        bw.flush();
        bw.close();

    }

    public static void dfs(int start) {
        if (visited[start]) {
            return;
        }
        visited[start] = true;
        dfsResult.add(start);

        for (int next : graph[start]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) {
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        bfsResult.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            List<Integer> adj = graph[current];
            for (int i = 0; i < adj.size(); i++) {
                if (!visited[adj.get(i)]) {
                    visited[adj.get(i)] = true;
                    queue.add(adj.get(i));
                    bfsResult.add(adj.get(i));
                }
            }
        }
    }
}
