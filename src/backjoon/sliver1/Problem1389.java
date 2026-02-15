package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem1389 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] nums;

    public static void main(String[] args)throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int human = Integer.parseInt(inputs[0]);
        int relation = Integer.parseInt(inputs[1]);

        nums = new int[human + 1];
        visited = new boolean[human + 1];

        graph = new List[human + 1];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < relation; i++){
            String[] numbers = br.readLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i =1; i <= human; i++){
            for(int j =1; j <= human; j++){
                if(i!=j) bfs(i,j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= human; i++){
            min = Math.min(min, nums[i]);
        }

        for(int i = 1; i < nums.length; i++){
            if(min == nums[i]){
                System.out.println(i);
                break;
            }
        }

    }

    static void bfs (int n, int m){
        Arrays.fill(visited, false);
        visited[n] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{n,0});
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int location = current[0];
            int distance = current[1];
            if(current[0] == m){
                nums[n]+= distance;
                break;
            }
            for(int k : graph[location]){
                if(!visited[k]){
                    visited[k] = true;
                    queue.add(new int[]{k, distance +1});
                }
            }
        }
    }
}
