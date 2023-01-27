package src.hanghae99;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            answer += i%2 == 0 ? "수" : "박";
        }
        return answer;
    }

    public static void main(String[] args) {
        수박수박수박수박수박수 s = new 수박수박수박수박수박수();
        int n = 5;
        System.out.println(s.solution(n));
    }
}
