package src.hanghae99;

public class 하샤드_수 {
    public boolean solution(int x) {
        boolean answer = true;
        int x2 = x;
        int num = 0;
        while(x2 != 0){
            num += x2%10;
            x2 /= 10;
        }
        answer = x % num == 0;
        return answer;
    }

    public static void main(String[] args) {
        하샤드_수 s = new 하샤드_수();
        int n = 626331;
        System.out.println(s.solution(n));
    }
}
