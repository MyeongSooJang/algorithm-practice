package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Problem1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] nums1 = br.readLine().split(" ");
        Set<Long> sets = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sets.add(Long.parseLong(nums1[i]));
        }

        int m = Integer.parseInt(br.readLine());
        String[] nums2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if (sets.contains(Long.parseLong(nums2[i]))) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
