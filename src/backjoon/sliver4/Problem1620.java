package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Problem1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int num = Integer.parseInt(inputs[0]);
        int count = Integer.parseInt(inputs[1]);
        Map<Integer, String> lists1 = new HashMap<>();
        Map<String, Integer> lists2 = new HashMap<>();
        for (int i = 1; i <= num; i++) {
            String name = br.readLine();
            lists1.put(i, name);
            lists2.put(name, i);
        }
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            if (input.matches("\\d+")) {
                bw.write(lists1.get(Integer.parseInt(input)) + "\n");
            } else {
                bw.write(lists2.get(input) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
