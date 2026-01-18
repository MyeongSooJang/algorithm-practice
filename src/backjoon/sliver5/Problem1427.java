package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("");
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            lists.add(Integer.parseInt(strs[i]));
        }
        lists.sort((a, b) -> {
            return b - a;
        });
        lists.forEach(System.out::print);
    }
}
