package backjoon.sliver2;

import java.util.*;
import java.io.*;

public class Problem15663 {
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[] intArr;
    static int count, pick;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        intArr = new int[count];
        visited = new boolean[count];
        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < count; i++) {
            intArr[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(intArr);
        solution(0);
        System.out.print(sb.toString());
    }

    public static void solution(int depth) {
        if(depth == pick) {
            for(int i = 0; i < list.size(); i++) {
                if(i > 0) sb.append(" ");
                sb.append(list.get(i));
            }
            sb.append("\n");
            return;
        }

        int temp = -1;
        for(int i = 0; i < count; i++) {
            int now = intArr[i];


            if(visited[i] || temp == now) {
                continue;
            }

            temp = now;
            visited[i] = true;
            list.add(intArr[i]);
            solution(depth + 1);


            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
