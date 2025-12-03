package inflearn.basic;

import java.util.*;

public class ChangeLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String result = ChangeLetter.solution(input);
        System.out.print(result);
    }

    public static String solution(String input) {
        char[] chars = input.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while(lt < rt) {
            if (!Character.isLetter(chars[lt])) {
                lt++;
            } else if (!Character.isLetter(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }
}
