package src.hanghae99;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int min = arr2[0];
        int index = 0;
        for (int i : arr) {
            if (i != min) {
                answer[index++] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        제일_작은_수_제거하기 s = new 제일_작은_수_제거하기();
        int[] arr = new int[]{4, 3, 2, 1};
        System.out.println(s.solution(arr));
    }
}
