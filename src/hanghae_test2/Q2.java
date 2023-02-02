package src.hanghae_test2;

class Q2 {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("X");
        for (String s1 : str) {
            for(int i=0; i<s1.length(); i++){
                answer += i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q2 method = new Q2();
        String s = "OOOOOOOOOO";
        System.out.println(method.solution(s));
    }
}
