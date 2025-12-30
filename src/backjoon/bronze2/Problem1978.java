package backjoon.bronze2;
import java.util.*;

public class Problem1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        solution(str);
    }

    public static void solution(String str) {
        int[] inputs = Arrays.stream(str.trim().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        boolean[] result = new boolean[1001];
        for (int i = 2; i < result.length; i++) {
            if (result[i] == false) {
                for (int j = 2; i*j < result.length; j++) {
                    result[i*j] = true;
                }
            }
        }
        result[1] = true;
        int count = 0;
        for (int i :  inputs) {
            if (result[i] == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
