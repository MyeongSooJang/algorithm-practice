package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] intArr = new int[n];
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(inputs[i]);
            sortedArr[i] = intArr[i];
        }
        Arrays.sort(sortedArr);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : sortedArr) {
            if (!map.containsKey(num)) {
                map.put(num, count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(map.get(intArr[i]));
        }

        System.out.println(sb.toString());

    }
}
