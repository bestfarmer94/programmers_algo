package src.hanghae99;

import java.util.Arrays;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if (answer.length() == 0) {
            answer = participant[participant.length - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        완주하지_못한_선수 s = new 완주하지_못한_선수();
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        System.out.println(s.solution(participant, completion));
    }
}
