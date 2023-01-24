package src.level2;

import java.util.Arrays;
import java.util.HashSet;

public class 영어_끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};
        char last = words[0].charAt(words[0].length() - 1);
        HashSet<String> hash = new HashSet<>();
        hash.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);

            if (last != first || hash.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            hash.add(words[i]);
            last = words[i].charAt(words[i].length() - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        영어_끝말잇기 s = new 영어_끝말잇기();
        int n = 3;
        String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(s.solution(n, words)));
    }
}
