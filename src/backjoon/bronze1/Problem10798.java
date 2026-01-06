package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] results = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            String[] inputs = input.split("");
            for (int j = 0; j < inputs.length; j++) {
                results[i][j] = inputs[j];
            }
        }
        for (int j =0; j < 15; j++) {
            for (int i =0; i < 5; i++) {
                if(results[i][j]!= null){
                    System.out.print(results[i][j]);
                }
            }
        }
    }
}
