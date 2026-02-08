package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Problem9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> lists = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int count = Integer.parseInt(br.readLine());
            for (int j = 0; j < count; j++) {
                String[] input = br.readLine().split(" ");
                String type = input[1];
                if (lists.containsKey(type)) {
                    lists.put(type, lists.get(type) + 1);
                } else {
                    lists.put(type, 1);
                }
            }
            int result = 1;
            for (int value : lists.values()) {
                result *= (value + 1);
            }
            result -= 1;
            bw.write(result + "\n");
            lists.clear();
        }
        bw.flush();
        bw.close();
    }
}
