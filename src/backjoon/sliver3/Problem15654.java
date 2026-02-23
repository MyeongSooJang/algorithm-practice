package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15654 {
    static List<Integer> select = new ArrayList<>();
    static int pick, count;
    static StringBuilder sb = new StringBuilder();
    static int[] intArr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);
        intArr = new int[count];
        visited = new boolean[count];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(intArr);
        dfs(0);

    }

    public static void dfs(int start) {
        if (select.size() == pick) {
            for (int i = 0; i < select.size(); i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(select.get(i));
            }
            System.out.println(sb.toString());
            sb.setLength(0);
            return;
        }
        for (int i = 0; i < count; i++) {
            if (!visited[i]) {
                visited[i] = true;
                select.add(intArr[i]);
                dfs(i + 1);
                select.remove(select.size() - 1);
                visited[i] = false;
            }
        }
    }
}
