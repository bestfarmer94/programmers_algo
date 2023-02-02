package src.hanghae_test2;

class Main {
    public int solution(int num) {
        int answer = 0;
        int change = 1000 - num;
        int[] money = new int[]{500, 100, 50, 10};

        for (int i : money) {
            answer += change / i;
            change %= i;
            if (change == 0) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int num1 = 320;
        System.out.println(method.solution(num1));
    }
}