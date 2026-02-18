package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1541 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] splits = input.split("-");
        int sum = 0;
        int answer = 0;
        for(int i = 0; i < splits.length; i++){
            String[] result = splits[i].split("\\+");
            for(int j = 0; j < result.length; j++){
                sum += Integer.parseInt(result[j]);
            }
            if(i == 0) answer += sum;
            else answer -= sum;
            sum = 0;
        }
        System.out.println(answer);

    }
}
