package backjoon.sliver5;

import java.util.*;

public class Problem1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        PriorityQueue<Integer> sticks = new PriorityQueue<>();
        sticks.offer(64);

        while (sum(sticks) > X) {
            int shortest = sticks.poll();
            int half = shortest / 2;

            sticks.offer(half);

            if (sum(sticks) < X) {
                sticks.offer(half);
            }
        }

        System.out.println(sticks.size());
    }

    private static int sum(PriorityQueue<Integer> sticks) {
        return sticks.stream().mapToInt(Integer::intValue).sum();
    }
}
