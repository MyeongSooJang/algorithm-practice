package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Problem1697 {
    static boolean[] visited;
    static int[] field;
    static int count;
    static int MAX;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int start = Integer.parseInt(inputs[0]);
        int end = Integer.parseInt(inputs[1]);
        MAX = 100001;
        visited = new boolean[MAX];
        field = new int[MAX];
        int result = bfs(start, end);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

    static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        field[start] = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                return field[current];
            }

            int[] strategy = {current - 1, current + 1, current * 2};
            for (int next : strategy) {
                if (next >= 0 && next < MAX && !visited[next]) {
                    visited[next] = true;
                    field[next] = field[current] + 1;
                    queue.add(next);
                }
            }
        }
        return field[end];
    }
}
