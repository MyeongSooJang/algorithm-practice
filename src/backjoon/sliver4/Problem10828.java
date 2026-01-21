package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        class MakeStack {
            public List<Integer> stack = new ArrayList<>();

            MakeStack() {}

            public void push(int n) {
                stack.add(n);
            }

            public int pop() {
                if (stack.size() == 0) {
                    return -1;
                } else {
                    return stack.remove(stack.size() - 1);
                }
            }

            public int size() {
                return stack.size();
            }

            public int empty() {
                if (stack.size() == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

            public int top() {
                if (stack.size() == 0) {
                    return -1;
                } else {
                    return stack.get(stack.size() - 1);
                }
            }
        }
        MakeStack stack = new MakeStack();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push" : stack.push(Integer.parseInt(str[1])); break;
                case "pop" : bw.write(stack.pop() + "\n"); break;
                case "size" : bw.write(stack.size() + "\n");break;
                case "top" : bw.write(stack.top() + "\n");break;
                case "empty" : bw.write(stack.empty() + "\n");break;
            }
        }

        bw.flush();
        bw.close();

    }
}
