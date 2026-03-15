package backjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Problem1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());
        int bus = Integer.parseInt(br.readLine());

        List<int[]>[] graph = new ArrayList[city + 1];
        for (int i = 1; i <= city; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < bus; i++) {
            String[] inputs = br.readLine().split(" ");
            int start = Integer.parseInt(inputs[0]);
            int end = Integer.parseInt(inputs[1]);
            int cost = Integer.parseInt(inputs[2]);
            graph[start].add(new int[]{end, cost});
        }

        String[] problems = br.readLine().split(" ");
        int pStart = Integer.parseInt(problems[0]);
        int pEnd = Integer.parseInt(problems[1]);

        int[] dist = new int[city + 1];
        for (int i = 1; i <= city; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[pStart] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        queue.add(new int[]{pStart, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int money = current[1];
            if (dist[current[0]] < money) {
                continue;
            }
            for (int[] arr : graph[current[0]]) {
                if (dist[arr[0]] > arr[1] + money) {
                    dist[arr[0]] = arr[1] + money;
                    queue.add(new int[]{arr[0], arr[1] + money});
                }
            }
        }

        System.out.println(dist[pEnd]);
    }
}
