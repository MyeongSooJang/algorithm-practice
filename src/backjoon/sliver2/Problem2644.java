package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem2644 {
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int all = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int one = Integer.parseInt(inputs[0]);
        int two = Integer.parseInt(inputs[1]);

        int test = Integer.parseInt(br.readLine());
        graph = new List[all + 1];
        visited = new boolean[all + 1];
        for(int i = 1; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < test; i++){
            String[] inputs2 = br.readLine().split(" ");
            int a = Integer.parseInt(inputs2[0]);
            int b = Integer.parseInt(inputs2[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        System.out.println( bfs(one, two));


    }
    public static int bfs(int n, int m){
        visited[n] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{n, 0});
        int count = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            if(current[0] == m) return current[1];
            for(int connect : graph[current[0]]){
                if(!visited[connect]){
                    visited[connect] = true;
                    queue.add(new int[]{connect, current[1] + 1});
                }
            }
        }
        return -1;
    }
}
