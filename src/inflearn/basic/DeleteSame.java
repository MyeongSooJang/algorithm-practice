package inflearn.basic;

import java.util.*;
import java.util.stream.*;


public class DeleteSame {
    public static String solution(String input) {
        return input.chars()
                .distinct()
                .mapToObj(c-> String.valueOf((char)c))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        solution(input1);
        System.out.println((solution(input1)));
    }
}
