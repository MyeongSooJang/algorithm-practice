package backjoon.sliver3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Problem17626 {
    static boolean[] visited;
    static int N;
    static List<Integer> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i * i <= N; i++) {
            graph.add(i * i);
        }

        int result = bfs();
        System.out.println(result);
    }

    static int bfs() {
        visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                for (int num : graph) {
                    int next = current - num;

                    if (next == 0) {
                        return count;
                    }

                    if (next > 0 && !visited[next]) {
                        queue.add(next);
                        visited[next] = true;
                    }
                }
            }
        }

        return count;
    }
}
