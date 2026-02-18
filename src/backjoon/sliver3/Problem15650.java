package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem15650 {
    static List<Integer> select = new ArrayList<>();
    static int pick, end;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        end = Integer.parseInt(conditions[0]);
        pick = Integer.parseInt(conditions[1]);

        dfs(1,0);
    }

    public static void dfs(int start, int depth){
        if(depth == pick){
            for(int i = 0; i < select.size(); i++){
                if(select.size()-1 != i) sb.append(select.get(i)).append(" ");
                else sb.append(select.get(i));

            }
            System.out.println(sb.toString());
            sb.setLength(0);
            return;
        }
        for(int i = start; i <= end; i++){
            select.add(i);

            dfs(i + 1, depth + 1);

            select.remove(select.size() - 1);
        }
    }
}
