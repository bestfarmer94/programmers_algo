package src.hanghae99;

import java.util.ArrayList;

public class 같은_숫자는_싫어 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i : arr) {
            if (i != list.get(list.size() - 1)) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        같은_숫자는_싫어 s = new 같은_숫자는_싫어();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(s.solution(arr));
    }
}
