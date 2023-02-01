package src.level2;

import java.util.Arrays;

class 행렬의_곱셈__deepToString {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int[][] answer2 = new int[arr1.length][arr2[0].length];
        int[][] arr3 = new int[arr2[0].length][arr2.length];

        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                arr3[i][j] = arr2[j][i];
            }
        }

        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                answer[i][j] = multiply(arr1[i], arr3[j]);
            }
        }

        // 위의 코드를 한번에 풀어낸 코드.
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                for(int k=0; k<arr1[0].length; k++){
                    answer2[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(answer2));

        return answer;
    }

    int multiply(int[] arr1, int[] arr3){
        int answer = 0;
        for(int i=0; i<arr1.length; i++){
            answer += arr1[i] * arr3[i];
        }
        return answer;
    }
}