package src.hanghae99;

import java.util.HashSet;

public class 두_개_뽑아서_더하기__hash_toArray {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hash.add(numbers[i] + numbers[j]);
            }
        }
        // Integer 타입이 가능하면 return hash.toArray(new int[0]);
        int[] answer = new int[hash.size()];
        Integer[] hash_array = hash.toArray(new Integer[0]);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = hash_array[i];
        }
        return answer;
    }
}
