package backjoon.sliver2;

import java.util.*;
import java.io.*;

public class Problem2108 {
    class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw =
                    new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            int[] intArr = new int[n];
            for (int i = 0; i < n; i++) {
                intArr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(intArr);
            bw.write(Math.round((double) Arrays.stream(intArr).sum() / n) + "\n");
            int middle = n / 2;
            bw.write(intArr[middle] + "\n");
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(intArr[i])) {
                    int count = map.get(intArr[i]);
                    map.put(intArr[i], count + 1);
                } else {
                    map.put(intArr[i], 1);

                }
            }
            int big = Collections.max(map.values());
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == big) {
                    list.add(entry.getKey());
                }
            }
            Collections.sort(list);
            int mode = 0;
            if (list.size() > 1) {
                mode = list.get(1);
            } else {
                mode = list.get(0);
            }
            bw.write(mode + "\n");

            bw.write(intArr[n - 1] - intArr[0] + "\n");
            bw.flush();
            bw.close();
        }
    }
}
