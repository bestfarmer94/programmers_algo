package src.hanghae99;

class 숫자_문자열과_영단어 {
    public int solution(String s) {
        int answer = 0;
        String[] str = new String[]{
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"
        };
        for(int i=0; i<str.length; i++){
            s = s.replace(str[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        숫자_문자열과_영단어 s = new 숫자_문자열과_영단어();
        String str = "one4seveneight";
        s.solution(str);
    }
}