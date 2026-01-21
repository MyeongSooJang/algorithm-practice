package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Problem10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] users = br.readLine().split(" ");
        Set<Integer> cards = new HashSet<>();
        for (int i = 0; i < n; i++) {
            cards.add(Integer.parseInt(users[i]));
        }
        int m = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if (cards.contains(Integer.parseInt(inputs[i]))) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
    }

}
