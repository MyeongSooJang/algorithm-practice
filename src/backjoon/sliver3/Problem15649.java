package backjoon.sliver3;

import java.util.*;
import java.io.*;

public class Problem15649 {
    static int count, pick;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        arr = new int[count];
        visited = new boolean[count];

        for(int i = 0; i < count; i++){
            arr[i] = i + 1;
        }

        dfs(0);
        System.out.println(sb.toString());
    }

    public static void dfs(int depth){
        if(depth == pick){
            for(int i = 0; i < list.size(); i++){
                if(i > 0) sb.append(" ");
                sb.append(list.get(i));
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                list.add(arr[i]);
                visited[i] = true;

                dfs(depth + 1);

                list.removeLast();
                visited[i] = false;
            }
        }
    }
}
