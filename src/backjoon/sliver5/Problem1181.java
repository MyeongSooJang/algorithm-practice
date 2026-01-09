package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Problem1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = (Integer.parseInt(br.readLine()));
        Set<String> inputs = new HashSet();
        for (int i = 0; i < n; i++) {
            inputs.add(br.readLine());
        }
        solution(inputs);
        br.close();
    }

    public static void solution(Set<String> inputs) {
        List<String> list = inputs.stream().collect(Collectors.toList());
        list.sort((s1, s2) -> {
            if(s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        });
        list.forEach(System.out::println);
    }

}
