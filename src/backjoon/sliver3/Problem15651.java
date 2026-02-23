package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem15651 {
    static int count, pick;
    static int[] intArr;
    static StringBuilder sb = new StringBuilder();
    static List<Integer> list = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        count = Integer.parseInt(inputs[0]);
        pick = Integer.parseInt(inputs[1]);

        intArr = new int[count];
        for (int i = 0; i < count; i++) {
            intArr[i] = i + 1;
        }

        dfs(0);
        System.out.println(sb.toString());
    }

    public static void dfs(int depth) {
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
        for (int i = 0; i < count; i++) {
            list.add(intArr[i]);
            dfs(depth + 1);
            list.remove(list.size() - 1);
        }
    }
}
