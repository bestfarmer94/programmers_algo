package src.hanghae99;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for (int[] size : sizes) {
            int temp_max = Math.max(size[0], size[1]);
            int temp_min = Math.min(size[0], size[1]);
            max = temp_max > max ? temp_max : max;
            min = temp_min > min ? temp_min : min;
        }

        return max * min;
    }

    public static void main(String[] args) {
        최소직사각형 s = new 최소직사각형();
        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(s.solution(sizes));
    }
}
