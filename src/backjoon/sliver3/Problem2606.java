package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem2606 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int count =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        int choices = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < choices; i++) {
            String[] line = br.readLine().split(" ");
            int start = Integer.parseInt(line[0]);
            int end = Integer.parseInt(line[1]);
            graph[start].add(end);
            graph[end].add(start);
        }
        dfs(1);
        bw.write(String.valueOf(count-1));
        bw.flush();
        bw.close();

    }


    static void dfs(int node) {
        visited[node] = true;
        count++;
        for(int end : graph[node]){
            if(!visited[end]){
                dfs(end);
            }
        }
    }
}
