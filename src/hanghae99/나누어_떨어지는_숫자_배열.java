package src.hanghae99;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public Integer[] solution(int[] arr, int divisor) {
        Integer[] answer;
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        for (int i : arr) {
            if(i % divisor == 0){
                temp.add(i);
            }
        }

        if(temp.size() == 0){
            answer = new Integer[]{-1};
        }else{
            answer = new Integer[temp.size()];
            temp.toArray(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        나누어_떨어지는_숫자_배열 s = new 나누어_떨어지는_숫자_배열();
        int[] arr = new int[] {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(s.solution(arr, divisor));
    }
}
