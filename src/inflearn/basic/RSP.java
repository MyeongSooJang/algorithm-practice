package inflearn.basic;

import java.util.Scanner;

public class RSP {
    public static char[] solution(int repeat, String input1, String input2) {
        String[] a = input1.split(" ");

        String[] b = input2.split(" ");

        char[] result = new char[repeat];

        for (int i = 0; i < repeat; i++) {
            int answer = 0;
            answer = Integer.parseInt(a[i]) - Integer.parseInt(b[i]);

            if (answer == 1 || answer == -2) {
                result[i] = 'A';
            }
            if (answer == -1 || answer == 2) {
                result[i] = 'B';
            }
            if (answer == 0) {
                result[i] = 'D';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int repeat = in.nextInt();
        in.nextLine();
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        char[] result = solution(repeat, input1, input2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
