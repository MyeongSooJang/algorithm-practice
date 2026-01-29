package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Problem1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[input + 1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{input, 0});
        visited[input] = true;

        while (q.peek() != null) {
            int[] current = q.poll();
            int num = current[0];
            int repeat = current[1];

            if (num == 1) {
                bw.write(repeat + "\n");
                break;
            }

            if (!visited[num - 1]) {
                visited[num - 1] = true;
                q.offer(new int[]{num - 1, repeat + 1});
            }

            if (num % 2 == 0 && !visited[num / 2]) {
                visited[num / 2] = true;
                q.offer(new int[]{num / 2, repeat + 1});
            }
            if (num % 3 == 0 && !visited[num / 3]) {
                visited[num / 3] = true;
                q.offer(new int[]{num / 3, repeat + 1});
            }

        }
        bw.flush();
        bw.close();
    }
}
