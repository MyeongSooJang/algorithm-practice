package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem11403 {
    static int size;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(br.readLine());
        visited = new boolean[size];
        graph = new List[size];

        for (int i = 0; i < size; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < size; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                if (Integer.parseInt(inputs[j]) == 1) {
                    graph[i].add(j);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            bw.write(bfs(i) + "\n");
            Arrays.fill(visited, false);
        }
        bw.flush();
        bw.close();
    }

    public static String bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                if (visited[i]) {
                    sb.append(1 + " ");
                } else {
                    sb.append(0 + " ");
                }
            } else {
                if (visited[i]) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
        }
        return sb.toString();
    }
}
