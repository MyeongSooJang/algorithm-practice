package inflearn.basic;

import java.util.Scanner;

public class ReverseSpecificCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // 왼쪽에서 알파벳 찾기
            if (!Character.isAlphabetic(arr[left])) {
                left++;
            }
            // 오른쪽에서 알파벳 찾기
            else if (!Character.isAlphabetic(arr[right])) {
                right--;
            }
            // 둘 다 알파벳이면 교환
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(arr);
    }
}
