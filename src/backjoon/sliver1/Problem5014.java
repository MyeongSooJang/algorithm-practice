package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Problem5014 {
    static int[] move;
    static int height;
    static int end;
    static int up;
    static int down;
    static int[] field;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        height = Integer.parseInt(inputs[0]);
        int start = Integer.parseInt(inputs[1]);
        move = new int[2];
        end = Integer.parseInt(inputs[2]);
        up = Integer.parseInt(inputs[3]);
        move[0] = up;
        down = Integer.parseInt(inputs[4]);
        move[1] = down;

        field = new int[height + 1];
        visited = new boolean[height + 1];

        int result = bfs(start);
        if (result == -1) {
            bw.write("use the stairs");
        } else {
            bw.write(field[end] + "\n");
        }
        bw.flush();
        bw.close();

    }

    static int bfs(int start) {
        int count = 1;
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == end) {
                return field[current];
            }
            for (int i = 0; i < move.length; i++) {
                int strategy;
                if (i == 0) {
                    strategy = current + move[i];
                } else {
                    strategy = current - move[i];
                }
                if (strategy > 0 && strategy <= height && !visited[strategy]) {
                    visited[strategy] = true;
                    field[strategy] = field[current] + 1;
                    queue.add(strategy);
                }

            }

        }
        return -1;
    }
}
