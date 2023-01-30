package src.hanghae99;

import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int count = 0;
        for (int i : lottos) {
            if (i == 0) {
                count++;
                continue;
            }
            break;
        }

        int i = count;
        int j = 0;
        int win = 0;

        while(i != lottos.length && j != win_nums.length){
            int myNum = lottos[i];
            int winNum = win_nums[j];
            if(myNum == winNum){
                win++;
                i++;
                j++;
            }else{
                if(myNum > winNum){
                    j++;
                }else{
                    i++;
                }
            }
        }

        int max_rank = 7 - (win + count) > 6 ? 6 : 7 - (win + count);
        int min_rank = 7 - win > 6 ? 6 : 7 - win;
        answer = new int[]{max_rank, min_rank};
        return answer;
    }
}
