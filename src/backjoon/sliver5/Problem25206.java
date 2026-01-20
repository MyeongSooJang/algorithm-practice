package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        double sum = 0;
        double count = 0;
        while ((str = br.readLine()) != null) {
            if (str.trim().isEmpty()) break;
            String[] inputs = str.split(" ");
            double num = Double.parseDouble(inputs[1]);
            String rank = inputs[2];
            switch (rank) {
                case "A+":
                    sum += num * 4.5;
                    break;
                case "A0":
                    sum += num * 4.0;
                    break;
                case "B+":
                    sum += num * 3.5;
                    break;
                case "B0":
                    sum += num * 3.0;
                    break;
                case "C+":
                    sum += num * 2.5;
                    break;
                case "C0":
                    sum += num * 2.0;
                    break;
                case "D+":
                    sum += num * 1.5;
                    break;
                case "D0":
                    sum += num;
                    break;
                case "F":
                    sum += num * 0.0;
                    break;
                case "P":
                    count -=num;
                    break;
            }
            count += num;
        }
        double average = sum / count;
        System.out.println(average);
    }
}
