package backjoon.bronze3;

import java.util.*;

public class Problem4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            int[] inputNum = Arrays.stream(input.trim().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            if (Arrays.stream(inputNum).sum() == 0) {
                break;
            }
            result.add(solution(inputNum));
        }
        result.forEach(System.out::println);
    }

    public static String solution(int[] inputNum) {
        Arrays.sort(inputNum);
        if (inputNum[2] * inputNum[2]== inputNum[1]*inputNum[1]+ inputNum[0]*inputNum[0] ) {
            return "right";
        } else {
            return "wrong";
        }
    }
}
