package src.level2;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        int answer = 1;
        int[] numbers = new int[101];
        int number = 2;
        boolean end = false;

        while (!end) {
            end = true;
            boolean plus = true;
            for (int i = 0; i < arr.length; i++) {
                if (number < arr[i]) {
                    end = false;
                }
                if (arr[i] % number == 0) {
                    arr[i] = arr[i] / number;
                    plus = false;
                }
            }
            if (plus) {
                number++;
            } else {
                numbers[number]++;
            }
        }
        for (int i = 2; i <= 100; i++) {
            answer *= Math.pow(i, numbers[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        N개의_최소공배수 s = new N개의_최소공배수();
        int[] arr = new int[]{2, 6, 8, 14};
        System.out.println(s.solution(arr));
    }
}
