package src.hanghae99;

import java.util.Arrays;

class 소수_만들기__DFS {
    static int answer;
    public int solution(int[] nums) {
        dfs(nums, new int[3], 0, 0);
        return answer;
    }

    void dfs(int[] nums, int[] selected, int depth, int now){
        if(depth == 3){
            if(confirm(selected)){
                answer++;
            }
            return;
        }

        for (int i = now; i < nums.length; i++) {
            selected[depth] = nums[i];
            dfs(nums, selected, depth+1, i+1);
        }
    }

    boolean confirm(int[] selected){
        int sum = Arrays.stream(selected).sum();
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if(sum % i == 0){
                return false;
            }
        }
        return true;
    }
}