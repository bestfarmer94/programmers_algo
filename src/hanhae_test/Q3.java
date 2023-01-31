package src.hanhae_test;

import java.util.Arrays;

public class Q3 {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        boolean[] sosu = new boolean[arr[arr.length-1]+1];
        for (int i = 2; i <= Math.sqrt(arr[arr.length - 1]); i++) {
            if(sosu[i]){
                continue;
            }
            int temp = 2*i;
            while(temp <= arr[arr.length-1]){
                sosu[temp] = true;
                temp += i;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if(!sosu[i] && i > max){
                max = i;
            }
            if(sosu[i] && i < min){
                min = i;
            }
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        Q3 method = new Q3();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}
