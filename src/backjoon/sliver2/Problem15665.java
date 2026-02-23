package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15665 {
    static int count, pick;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        count = Integer.parseInt(inputs[0]);
        pick = Integer.parseInt(inputs[1]);

        arr = new int[count];
        String[] nums = br.readLine().split(" ");
        for(int i = 0; i< count; i++){
            arr[i] = Integer.parseInt(nums[i]);
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
        int temp = -1;
        for(int i = 0; i < count; i++){
            int now = arr[i];
            if(now != temp){
                temp = now;
                list.add(arr[i]);
                dfs(depth + 1);
                list.remove(list.size()-1);
            }
        }
    }
}
