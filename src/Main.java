import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (isGroupWord(str)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static boolean isGroupWord(String str) {
        Set<Character> saved = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (i > 0 && current == str.charAt(i - 1)) {
                continue;
            }
            if (saved.contains(current)) {
                return false;
            }
            saved.add(current);
        }
        return true;
    }
}