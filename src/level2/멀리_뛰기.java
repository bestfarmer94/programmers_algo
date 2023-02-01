package src.level2;

public class 멀리_뛰기 {

    public long solution(int n) {
        long answer = 0;
        long[] jump = new long[n + 1];
        jump[0] = 1;
        jump[1] = 1;
        if (n == 1) {
            return 1;
        }
        answer = jump(jump, 2, n);
        return answer;
    }

    long jump(long[] jump, int now, int n) {
        jump[now] = jump[now - 1] + jump[now - 2];
        jump[now] = jump[now] > 1234567 ? jump[now] - 1234567 : jump[now];
        if (now == n) {
            return jump[now];
        }
        return jump(jump, now + 1, n);
    }
}
