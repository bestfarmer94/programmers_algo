package src.level2;

public class 점프와_순간_이동 {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        점프와_순간_이동 s = new 점프와_순간_이동();
        int n = 5000;
        System.out.println(s.solution(n));
    }
}
