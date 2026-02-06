package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem2468_BFS {
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(br.readLine());
        field = new int[size][size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                int input = Integer.parseInt(inputs[j]);
                field[i][j] = input;
                max = Math.max(max, input);
            }
        }
        List<Integer> safeZone = new ArrayList<>();
        for (int height = 0; height <= max; height++) {
            visited = new boolean[size][size];
            int count = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (!visited[i][j] && field[i][j] > height) {
                        bfs(i, j, height);
                        count++;
                    }
                }
            }
            safeZone.add(count);
        }
        Collections.sort(safeZone);
        bw.write(String.valueOf(safeZone.get(safeZone.size() - 1)));
        bw.flush();
        bw.close();

    }

    public static void bfs(int i, int j, int height) {
        visited[i][j] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int k = 0; k < 4; k++) {
                int X = current[0] + dx[k];
                int Y = current[1] + dy[k];
                if (0 <= X && X < size && 0 <= Y && Y < size
                        && field[X][Y] > height && !visited[X][Y]) {
                    queue.add(new int[]{X, Y});
                    visited[X][Y] = true;
                }
            }
        }
    }
}
