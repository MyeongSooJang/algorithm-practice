package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15665 {
    static int count, pick;
    static int[] arr;
    static boolean[] visited;
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);
        arr = new int[count];
        visited = new boolean[count];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb.toString());

    }

    public static void dfs(int depth, int start) {
        if (depth == pick) {
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(list.get(i));
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (!visited[i]) {
                list.add(arr[i]);
                visited[i] = true;

                dfs(depth + 1, i + 1);

                list.remove(list.size() - 1);
                visited[i] = false;
            }

        }
    }
}
