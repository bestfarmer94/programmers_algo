package src.hanghae99;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기_join_String배열을_String으로 {
    public long solution(long n) {
        long answer = 0;
        String str = "" + n;
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        str = String.join("", arr);
        answer = Long.parseLong(str);
        return answer;
    }

    public static void main(String[] args) {
        정수_내림차순으로_배치하기_join_String배열을_String으로 s = new 정수_내림차순으로_배치하기_join_String배열을_String으로();
        long n = 118372;
        System.out.println(s.solution(n));
    }
}
