package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split("");
            boolean result = false;
            lists.clear(); // 이전 줄의 데이터 삭제

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].equals("(")) {
                    lists.add(1);
                } else {
                    if (lists.size() == 0) {
                        bw.write("NO\n");
                        result = true;
                        break;
                    } else {
                        lists.remove(lists.size() - 1);
                    }
                }
            }

            if (!result) {
                if (lists.size() == 0) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
