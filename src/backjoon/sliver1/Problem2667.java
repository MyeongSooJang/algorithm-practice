package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2667 {
    static int[][] field;
    static boolean[][] visited;
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        field = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                field[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (field[i][j] == 1 && !visited[i][j]) {
                    lists.add(dfs(i, j));
                }
            }
        }
        Collections.sort(lists);

        bw.write(lists.size() + "\n");
        for (int i : lists) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int dfs(int x, int y) {
        int sum = 1;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int X = x + dx[i];
            int Y = y + dy[i];
            if (0 <= X && X < field.length && 0 <= Y && Y < field.length
                    && !visited[X][Y] && field[X][Y] == 1) {
                sum += dfs(X, Y);
            }
        }
        return sum;
    }
}
