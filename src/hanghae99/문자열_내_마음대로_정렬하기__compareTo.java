package src.hanghae99;

import java.util.Arrays;
import java.util.Comparator;

class 문자열_내_마음대로_정렬하기__compareTo {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.charAt(n) == o2.charAt(n)){
                    // o1과 o2를 비교할 것이라면 간단하게 이렇게 하면 됬을텐데...
                    return o1.compareTo(o2);
                    // 위를 구현 한 것.
                    // int min_length = (int)Math.min(o1.length(), o2.length());
                    // for(int i=0; i<min_length; i++){
                    //     if(o1.charAt(i) != o2.charAt(i)){
                    //         return o1.charAt(i) - o2.charAt(i);
                    //     }
                    // }
                    // return o1.length() - o2.length();
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }
}