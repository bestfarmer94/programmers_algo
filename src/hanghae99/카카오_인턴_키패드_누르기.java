package src.hanghae99;

import java.util.ArrayList;
import java.util.Arrays;

public class 카카오_인턴_키패드_누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        ArrayList<Integer> left = new ArrayList<>(Arrays.asList(new Integer[]{1, 4, 7}));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(new Integer[]{3, 6, 9}));

        int[] l_now = new int[]{3, 0};
        int[] r_now = new int[]{3, 2};

        for (int i : numbers) {
            if (i == 0) {
                i = 11;
            }

            String move_hand = "";
            if (left.contains(i)) {
                move_hand = "L";
                l_now = move(i, l_now);
            } else if (right.contains(i)) {
                move_hand = "R";
                r_now = move(i, r_now);
            } else {
                move_hand = choice_hand(i, l_now, r_now, hand);
                if (move_hand.equals("L")) {
                    l_now = move(i, l_now);
                } else {
                    r_now = move(i, r_now);
                }
            }

            answer += move_hand;
        }
        return answer;
    }

    String choice_hand(int i, int[] l_now, int[] r_now, String hand) {
        int l = Math.abs(l_now[0] - (i - 1) / 3) + Math.abs(l_now[1] - (i - 1) % 3);
        int r = Math.abs(r_now[0] - (i - 1) / 3) + Math.abs(r_now[1] - (i - 1) % 3);
        if (l < r) {
            return "L";
        } else if (l > r) {
            return "R";
        }
        return hand.toUpperCase().substring(0, 1);
    }

    int[] move(int i, int[] arr) {
        return new int[]{(i - 1) / 3, (i - 1) % 3};
    }

    public static void main(String[] args) {
        카카오_인턴_키패드_누르기 s = new 카카오_인턴_키패드_누르기();
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(s.solution(numbers, hand));
    }
}
