package src.hanghae99;

import java.util.Arrays;

class 모의고사__stream_max_getAsInt {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[4];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) {
                score[1]++;
            }

            if (answers[i] == arr2[i % arr2.length]) {
                score[2]++;
            }

            if (answers[i] == arr3[i % arr3.length]) {
                score[3]++;
            }
        }

        int count = 0;
        int max = Arrays.stream(score).max().getAsInt();

        for (int i = 1; i < score.length; i++) {

            if(max == score[i]){
                count++;
            }
        }
        answer = new int[count];
        count = 0;
        for (int i = 1; i < score.length; i++) {
            if(score[i] == max){
                answer[count++] = i;
            }
        }

        return answer;
    }
}