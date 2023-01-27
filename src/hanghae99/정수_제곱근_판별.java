package src.hanghae99;

public class 정수_제곱근_판별 {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long)Math.sqrt(n);
        answer = n == sqrt*sqrt ? (sqrt+1)*(sqrt+1) : -1;
        return answer;
    }

    public static void main(String[] args) {
        정수_제곱근_판별 s = new 정수_제곱근_판별();
        long n = 121;
        System.out.println(s.solution(n));
    }
}
