package backjoon.sliver2;

import java.util.*;
import java.io.*;

public class Problem15664 {
    static int count, pick, now;
    static int[] intArr;
    static boolean[] visited;
    static List<Integer> result = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        intArr = new int[count];
        visited = new boolean[count];

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            intArr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(intArr);
        dfs(0, 0);
        System.out.println(sb.toString());

    }

    public static void dfs(int depth, int start) {
        if (depth == pick) {
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(result.get(i));
            }
            sb.append("\n");
            return;
        }

        int before = -1;
        for (int i = start; i < count; i++) {
            int now =  intArr[i];
            if (visited[i] || before == now) {
                continue;
            }
            before = now;
            visited[i] = true;
            result.add(now);
            dfs(depth + 1, i + 1);
            result.remove(result.size() - 1);
            visited[i] = false;
        }
    }
}
