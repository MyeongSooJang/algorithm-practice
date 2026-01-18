package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        class MakeQueue {
            public List<Integer> lists = new ArrayList<>();

            MakeQueue() {}

            public void push(int n) {
                if (lists == null) {
                    lists = new ArrayList<>();
                }
                lists.add(n);
            }

            public int pop() {
                if (lists == null || lists.size() == 0) {
                    return -1;
                } else {
                    return lists.remove(0);
                }
            }

            public int size() {
                return lists.size();
            }

            public int empty() {
                if (lists == null || lists.size() == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

            public int front() {
                if (lists == null || lists.size() == 0) {
                    return -1;
                } else {
                    return lists.get(0);
                }
            }

            public int back() {
                if (lists == null || lists.size() == 0) {
                    return -1;
                } else {
                    return lists.get(lists.size() - 1);
                }
            }
        }
        MakeQueue queue = new MakeQueue();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push" : queue.push(Integer.parseInt(str[1])); break;
                case "pop" : bw.write(queue.pop() + "\n"); break;
                case "size" : bw.write(queue.size() + "\n");break;
                case "front" : bw.write(queue.front() + "\n");break;
                case "back" : bw.write(queue.back() + "\n");break;
                case "empty" : bw.write(queue.empty() + "\n");break;
            }
        }

        bw.flush();
        bw.close();

    }
}
