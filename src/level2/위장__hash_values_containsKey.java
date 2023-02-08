package src.level2;

import java.util.HashMap;

class 위장__hash_values_containsKey {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();

        for (String[] strings : clothes) {
            if (hash.containsKey(strings[1])) {
                hash.put(strings[1], hash.get(strings[1]) + 1);
            } else {
                hash.put(strings[1], 1);
            }
        }

        for (int i : hash.values()) {
            answer *= i + 1;
        }
        return answer - 1;
    }
}