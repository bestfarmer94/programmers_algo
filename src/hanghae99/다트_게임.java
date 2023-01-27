package src.hanghae99;

class 다트_게임 {
    static int score_now;
    static int score_pre;

    public int solution(String dartResult) {
        int answer = 0;
        score_now = dartResult.charAt(0) - '0';
        score_pre = 0;
        char[] carr = dartResult.toCharArray();

        for (int i = 1; i < carr.length; i++) {
            if (carr[i] >= '0' && carr[i] <= '9') {
                if(carr[i-1] == '1'){
                    score_now = 10;
                    continue;
                }
                answer += score_pre;

                int temp = score_now;
                score_now = carr[i] - '0';
                score_pre = temp;
                continue;
            }

            special(carr[i]);
        }
        answer += score_pre;
        answer += score_now;
        return answer;
    }

    void special(char c) {
        switch (c) {
            case 'D':
                score_now = (int)Math.pow(score_now, 2);
                break;
            case 'T':
                score_now = (int)Math.pow(score_now, 3);
                break;
            case '*':
                score_now *= 2;
                score_pre *= 2;
                break;
            case '#':
                score_now *= -1;
                break;
            default:
        }
    }

    public static void main(String[] args) {
        다트_게임 s = new 다트_게임();
        String dartResult = "1S2D*3T";
        System.out.println(s.solution(dartResult));
    }
}
