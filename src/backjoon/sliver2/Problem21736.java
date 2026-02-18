package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem21736 {
    static int N, M;
    static String[][] field;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] conditions = br.readLine().split(" ");
        N = Integer.parseInt(conditions[0]);
        M = Integer.parseInt(conditions[1]);

        field = new String[N][M];
        visited = new boolean[N][M];

        int X = 0;
        int Y = 0;

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                field[i][j] = inputs[j];
                if (inputs[j].equals("I")) {
                    X = i;
                    Y = j;
                }
            }
        }
        int result = bfs(X, Y);
        if(result == 0) System.out.println("TT");
        else System.out.println(result);
    }

    public static int bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = current[0] + dx[i];
                int newY = current[1] + dy[i];

                if (0 <= newX && newX < N && 0 <= newY && newY < M &&
                        !visited[newX][newY] && (field[newX][newY].equals("O") || field[newX][newY].equals("P"))) {
                    visited[newX][newY] = true;
                    queue.add(new int[]{newX, newY});
                    if (field[newX][newY].equals("P")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
