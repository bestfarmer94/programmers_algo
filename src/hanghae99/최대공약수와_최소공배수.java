package src.hanghae99;

class 최대공약수와_최소공배수 {
    public int[] solution(int n, int m) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        return new int[]{gcd, n * m / gcd};
    }
}