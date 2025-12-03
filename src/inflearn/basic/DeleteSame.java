package inflearn.basic;

import java.util.*;
import java.util.stream.*;


public class DeleteSame {
    public static String solution(String input) {
        char[] c = input.toCharArray();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (!result.contains(c[i])) {
                result.add(c[i]);
            }
        }
        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        solution(input1);
        System.out.println((solution(input1)));
    }
}
