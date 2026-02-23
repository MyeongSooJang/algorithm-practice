package backjoon.sliver2;

import java.util.*;
import java.io.*;

public class Problem15649 {
    static int count, pick;
    static int[] nums;
    static boolean[] visited;
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        nums = new int[count];
        visited = new boolean[count];

        for (int i = 0; i < count; i++) {
            nums[i] = i + 1;
        }
        dfs(0);
        System.out.println(sb.toString());
    }

    public static void dfs(int depth) {
        if (pick == depth) {
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(list.get(i));
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;
                dfs(depth + 1);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}

