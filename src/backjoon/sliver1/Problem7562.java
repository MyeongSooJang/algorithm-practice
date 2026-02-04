package backjoon.sliver1;

import java.util.*;
import java.io.*;

public class Problem7562 {
    static int[][] distance;
    static boolean[][] visited;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(br.readLine());
            distance = new int[size][size];
            visited = new boolean[size][size];
            String[] startpoint = br.readLine().split(" ");
            String[] endpoint = br.readLine().split(" ");
            int[] start = {Integer.parseInt(startpoint[0]), Integer.parseInt(startpoint[1])};
            int[] end = {Integer.parseInt(endpoint[0]), Integer.parseInt(endpoint[1])};
            int result = bfs(start, end);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();

    }

    static int bfs(int[] start, int[] end) {
        visited[start[0]][start[1]] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] == end[0] && current[1] == end[1]) {
                return distance[end[0]][end[1]];
            }
            for (int i = 0; i < 8; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if (nx >= 0 && nx < distance.length && ny >= 0 && ny < distance.length && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[current[0]][current[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }

}
