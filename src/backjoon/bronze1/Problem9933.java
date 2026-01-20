package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strs.add(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            for (int j = strs.get(i).length() - 1; j >= 0; j--) {
                sb.append(strs.get(i).charAt(j));
            }
            String result = sb.toString();
            if (strs.contains(result)) {
                int middle = (result.length() / 2) ;
                bw.write(result.length() + " " + result.charAt(middle));
                break;
            }
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
    }
}
