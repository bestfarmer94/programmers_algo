import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if(i == n){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 1, 2, 3, 4, 5};
        int num1 = 1;
        System.out.println(s.solution(numbers, num1));
    }
}
