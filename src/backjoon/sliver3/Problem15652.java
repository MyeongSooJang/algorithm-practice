package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem15652 {
    static int end, pick;
    static List<Integer> select = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        end = Integer.parseInt(inputs[0]);
        pick = Integer.parseInt(inputs[1]);

        dfs(1, 0);
    }

    public static void dfs(int n, int depth) {
        if (depth == pick) {
            for (int i = 0; i < select.size(); i++) {
                if (i > 0) sb.append(" ");
                sb.append(select.get(i));
            }
            System.out.println(sb.toString());
            sb.setLength(0);
            return;
        }
        for (int i = n; i <= end; i++) {
            select.add(i);

            dfs(i , depth + 1);

            select.remove(select.size() - 1);
        }
    }
}
