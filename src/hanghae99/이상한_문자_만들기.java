package src.hanghae99;

public class 이상한_문자_만들기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        for (String s1 : str) {
            String str_new = "";
            for (int i = 0; i < s1.length(); i++) {
                str_new += i % 2 == 0 ? s1.toUpperCase().charAt(i) : s1.toLowerCase().charAt(i);
            }
            answer += str_new + " ";
        }
        answer = answer.substring(0, answer.length() - 1);
        while (answer.length() != s.length()) {
            answer = answer.length() == s.length() ? answer : answer + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        이상한_문자_만들기 s = new 이상한_문자_만들기();
        String s2 = "  try hello  world   ";
        System.out.println(s.solution(s2));
    }
}

