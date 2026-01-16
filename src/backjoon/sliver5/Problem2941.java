package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

public class Problem2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw =
                new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String str = br.readLine();
        String unique = "dz=";
        List<String> lists =
                List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        str = str.replaceAll("dz=","B");
        for(String s: lists) {
            str = str.replaceAll(s,"B");
        }
        int count = str.length();
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
