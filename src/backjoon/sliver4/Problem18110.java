package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            bw.write("0");
            bw.flush();
            bw.close();
            return;
        }

        int percent = (int) Math.round(n * 0.15);

        int count = n - percent * 2;

        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(lists);

        int sum = 0;
        for (int i = percent; i < lists.size() - percent; i++) {
            sum += lists.get(i);
        }

        long average = Math.round((double) sum / count);

        bw.write(average + "");
        bw.flush();
        bw.close();
    }
}
