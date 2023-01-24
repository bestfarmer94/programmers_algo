class Solution {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
//            System.out.println(n);
            if (n % 2 == 0) {
                n /= 2;
            }else{
                n -= 1;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5000;
        System.out.println(s.solution(n));
    }
}
