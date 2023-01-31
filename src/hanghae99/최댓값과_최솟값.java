package src.hanghae99;

class 최댓값과_최솟값 {
    public String solution(String s) {
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<str.length; i++){
            int num = Integer.parseInt(str[i]);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        return min + " " + max;
    }
}