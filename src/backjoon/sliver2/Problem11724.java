package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Problem11724 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int count =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        visited = new boolean[num + 1];
        int choices = Integer.parseInt(input[1]);
        graph = new ArrayList[num + 1];
        for(int i = 0; i < num + 1; i++) {
            graph[i] =  new ArrayList<>();
        }
        for(int i = 0; i < choices; i++) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i = 1; i < num + 1; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }


    static void dfs(int node) {
        if(visited[node]) return;
        visited[node] = true;
        for(int i : graph[node]) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }
}
