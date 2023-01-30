package src.hanghae99;

class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            answer += i == (int)Math.pow((int)Math.sqrt(i), 2) ? -i : i;
        }
        return answer;
    }
}