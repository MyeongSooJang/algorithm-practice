package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[21];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (!input.equals("empty") && !input.equals("all")) {
                String[] strs = input.split(" ");
                String name = strs[0];
                int num = Integer.parseInt(strs[1]);
                solution(bw, arr, name, num);
            } else {
                elseCase( arr, input);
            }
        }
        bw.flush();


    }

    public static void solution(BufferedWriter bw, int[] arr, String name, int num) throws Exception {
        if (name.equals("add")) {
            arr[num] = num;
            return;
        }
        if (name.equals("remove")) {
            arr[num] = 0;
            return;
        }
        if (name.equals("check")) {
            if (arr[num] == num) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
            return;
        }
        if (name.equals("toggle")) {
            if (arr[num] == num) {
                arr[num] = 0;
            } else {
                arr[num] = num;
            }
            return;
        }
    }

    public static void elseCase(int[] arr, String name) {
        if (name.equals("all")) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] = i;
            }
            return;
        }
        if (name.equals("empty")) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] = 0;
            }
            return;
        }
    }
}
