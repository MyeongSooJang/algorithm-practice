import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String cards = sc.nextLine();
        solution(input, cards);
    }

    public static void solution(String input, String cards) {
        int[] inputs = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = inputs[1];

        int[] card = Arrays.stream(cards.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();

        int result = 0;

        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    int sums = card[i] + card[j] + card[k];
                    if (sums <= max && result < sums) {
                        result = sums;
                    }
                }
            }
        }
        System.out.println(result);
    }
}

