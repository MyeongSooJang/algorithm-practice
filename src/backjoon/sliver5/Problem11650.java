package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        list.sort((x, y) -> {
            if (Integer.parseInt(x.split(" ")[0]) != Integer.parseInt(y.split(" ")[0])) {
                return Integer.parseInt(x.split(" ")[0]) - Integer.parseInt(y.split(" ")[0]);
            } else {
                return  Integer.parseInt(x.split(" ")[1]) -  Integer.parseInt(y.split(" ")[1]);
            }
        });
        list.forEach(System.out::println);
    }
}
