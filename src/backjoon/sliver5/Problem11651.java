package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem11651 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(str[0]);
            arr[1] = Integer.parseInt(str[1]);
            list.add(arr);
        }
        list.sort((x, y)->{
            if(x[1] ==  y[1]) return x[0] - y[0];
            return x[1] - y[1];
        });
        list.forEach(x -> System.out.println(x[0] + " " + x[1]));
    }
}
