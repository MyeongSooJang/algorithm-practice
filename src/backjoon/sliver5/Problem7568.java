package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(strs[0]);
            arr[1] = Integer.parseInt(strs[1]);
            lists.add(arr);
        }
        int[] loses = new int[lists.size()];
        int lose = 0;
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (lists.get(i)[0] < lists.get(j)[0] &&
                        lists.get(i)[1] < lists.get(j)[1]) {
                    lose++;
                }
            }
            loses[i] = lose;
            lose = 0;
        }
        System.out.println(Arrays.stream(loses)
                .mapToObj(i -> String.valueOf(i + 1))
                .collect(Collectors.joining(" ")));
    }
}
