package backjoon.sliver4;

import java.util.*;
import java.io.*;

public class Problem1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> a = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> aMinusB = new HashSet<>(a);
        aMinusB.removeAll(b);

        Set<Integer> bMinusA = new HashSet<>(b);
        bMinusA.removeAll(a);

        System.out.println(aMinusB.size() + bMinusA.size());
    }
}
