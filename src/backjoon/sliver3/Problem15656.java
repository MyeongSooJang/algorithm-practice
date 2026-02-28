package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15656 {
    static int count,pick;
    static int[] arr;
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        arr = new int[count];
        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < inputs.length; i++){
            arr[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr);

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
        for (int j : arr) {
            list.add(j);

            dfs(depth + 1);

            list.removeLast();
        }
    }
}
