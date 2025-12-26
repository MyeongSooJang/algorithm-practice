package inflearn.basic;

import java.util.*;

public class UseStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int num = sc.nextInt();
        solution(input, num);
    }

    public static void solution(String input, int num) {
        String[] inputs = input.trim().split("\\s+");
        long result = Arrays.stream(inputs)
                .mapToInt(Integer::parseInt)
                .filter(x -> x == num)
                .count();
        System.out.println(result);
    }
}
