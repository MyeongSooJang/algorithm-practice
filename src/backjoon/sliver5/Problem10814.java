package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem10814 {
    public static void main(String[] args) throws Exception {
        List<Input> lists;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] strs = br.readLine().split(" ");
                lists.add(new Input(Integer.parseInt(strs[0]),
                        strs[1],
                        i));
            }
        }
        lists.sort(Comparator.comparingInt((Input i) -> i.age)
                .thenComparingInt(i -> i.num));

        lists.forEach(System.out::println);
    }

    static class Input {
        int age;
        String name;
        int num;

        public Input(int age, String name, int num) {
            this.age = age;
            this.name = name;
            this.num = num;
        }

        public int getAge() {
            return age;
        }

        public int getNum() {
            return num;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
