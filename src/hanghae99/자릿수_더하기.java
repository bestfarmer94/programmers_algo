package src.hanghae99;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        자릿수_더하기 s = new 자릿수_더하기();
        int n = 123;
        System.out.println(s.solution(n));
    }
}
