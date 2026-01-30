package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Problem1012 {
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count = 0;
    static int X, Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            String[] conditions = br.readLine().split(" ");
            X = Integer.parseInt(conditions[0]);
            Y = Integer.parseInt(conditions[1]);
            int locations = Integer.parseInt(conditions[2]);

            field = new int[X][Y];
            visited = new boolean[X][Y];
            for (int j = 0; j < locations; j++) {
                String[] s = br.readLine().split(" ");
                int x1 = Integer.parseInt(s[0]);
                int y1 = Integer.parseInt(s[1]);
                field[x1][y1] = 1;
            }
            for (int k = 0; k < X; k++) {
                for (int j = 0; j < Y; j++) {
                    if (field[k][j] == 1 && !visited[k][j]) {
                        dfs(k, j);
                        count++;
                    }
                }
            }
            bw.write(count +"\n");
            count =0;
        }
        bw.flush();
        bw.close();


    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < X && ny >= 0 && ny < Y && !visited[nx][ny] && field[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }

    }
}