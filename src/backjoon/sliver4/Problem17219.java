package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Problem17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] conditions = br.readLine().split(" ");
        int options = Integer.parseInt(conditions[0]);
        int finds = Integer.parseInt(conditions[1]);
        Map<String, String> choices = new HashMap<>();
        for (int i = 0; i < options ; i++) {
            String[] input = br.readLine().split(" ");
            choices.put(input[0], input[1]);
        }
        for (int i = 0; i < finds; i++) {
            bw.write(choices.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
