package src.hanghae99;

public class 진법3_뒤집기_Integer_to_진법표현 {
    public int solution(int n) {
        int answer;
//        String three = "";
//        while (n != 0) {
//            three += n % 3;
//            n /= 3;
//        }
        String three = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(three).reverse();
        three = sb.toString();
        answer = Integer.parseInt(three, 3);
        return answer;
    }

    public static void main(String[] args) {
        진법3_뒤집기_Integer_to_진법표현 s = new 진법3_뒤집기_Integer_to_진법표현();
        int n = 45;
        System.out.println(s.solution(n));
    }
}
