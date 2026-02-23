package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Problem16593 {
    static long start, end;

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        start = Long.parseLong(conditions[0]);
        end = Long.parseLong(conditions[1]);
        System.out.println(bfs(start));
    }

    public static long bfs(long start) {
        Set<Long> visited = new HashSet<>();
        visited.add(start);
        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{start, 1});
        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            if (current[0] == end) {
                return current[1];
            }
            long[] multi = new long[]{current[0] * 2, current[1] + 1};
            if (multi[0] <= end && !visited.contains(multi[0])) {
                visited.add(multi[0]);
                queue.add(multi);
            }
            long[] plusOne = new long[]{current[0] * 10 + 1, current[1] + 1};
            if (plusOne[0] <= end && !visited.contains(plusOne[0])) {
                visited.add(plusOne[0]);
                queue.add(plusOne);
            }
        }
        return -1;
    }
}
