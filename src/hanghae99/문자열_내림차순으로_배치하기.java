package src.hanghae99;

import java.util.Arrays;

class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        char[] carr = s.toCharArray();
        Arrays.sort(carr);
        String s2 = new String(carr);
        String answer = new StringBuilder(s2).reverse().toString();
        return answer;
    }
}