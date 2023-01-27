package src.hanghae99;

public class 콜라츠_추측 {
    public int solution(int num) {
        int answer = 0;
        long long_num = num;
        while (long_num != 1) {
            answer++;
            long_num = long_num % 2 == 0 ? long_num / 2 : long_num * 3 + 1;
            if(answer == 501){
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠_추측 s = new 콜라츠_추측();
        int n = 626331;
        System.out.println(s.solution(n));
    }
}
