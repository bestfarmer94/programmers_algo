package src.hanghae99;

class 소수_찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] sosu = new boolean[n + 1];

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (sosu[i]) {
                continue;
            }
            int temp = i;
            while (temp <= n) {
                if (temp != i) {
                    sosu[temp] = true;
                }
                temp += i;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!sosu[i]) {
                answer++;
            }
        }
        return answer;
    }

//    public static void main(String[] args) {
//        Solution s = new Solution();
//        String str = "=.=";
//        System.out.println(s.solution(str));
//    }
}