package backjoon.sliver5;

import java.util.*;
import java.io.*;

public class Problem2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        while (deque.size() > 1) {
            sb.append(deque.pollFirst()).append(" ");
            deque.addLast(deque.pollFirst());
        }

        sb.append(deque.poll());
        System.out.println(sb);
    }
}
