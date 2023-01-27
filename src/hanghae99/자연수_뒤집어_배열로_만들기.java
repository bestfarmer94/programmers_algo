package src.hanghae99;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        자연수_뒤집어_배열로_만들기 s = new 자연수_뒤집어_배열로_만들기();
        long n = 12345;
        System.out.println(s.solution(n));
    }
}
