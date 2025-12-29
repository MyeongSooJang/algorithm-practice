package backjoon.bronze3;

import java.util.*;

public class Problem30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        sc.nextLine();
        String count = sc.nextLine();
        String sets = sc.nextLine();
        solution(people, count, sets);
    }

    public static void solution(int people, String count, String sets) {
        int[] counts = Arrays.stream(count.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] set = Arrays.stream(sets.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                sum++;
                counts[i] = counts[i] - set[0];
            }
        }

        System.out.println(sum);
        System.out.println((people / set[1]) + " " + (people % set[1]));
    }
}
