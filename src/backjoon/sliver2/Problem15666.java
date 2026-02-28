package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15666 {
    static int count, pick;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] conditions = br.readLine().split(" ");
        count = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        arr = new int[count];

        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb.toString());
    }

    public static void dfs(int depth, int start){
        if(depth == pick){
            for(int i = 0; i < list.size(); i++){
                if(i > 0) sb.append(" ");
                sb.append(list.get(i));
            }
            sb.append("\n");
            return;
        }
        int temp = -1;
        for(int i = start; i < arr.length; i++){
            if(temp != arr[i]){
                list.add(arr[i]);
                temp = arr[i];
                dfs(depth + 1 , i);
                list.removeLast();
            }
        }
    }
}
