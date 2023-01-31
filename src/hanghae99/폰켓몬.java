package src.hanghae99;

import java.util.HashSet;
import java.util.Set;

class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> hash = new HashSet<>();
        for(int i : nums){
            hash.add(i);
        }
        answer = hash.size() > nums.length/2 ? nums.length/2 : hash.size();
        return answer;
    }
}