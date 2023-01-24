package src.level2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = 0;
        int multi = 0;
        //        brown == 2 * (width + height - 2);
        //        yellow == (width - 2) * (height - 2);
        //        width * height - 2 * (width + height) = yellow - 4;

        sum = brown / 2 + 2;
        multi = 2 * sum + yellow - 4;

        for (int i = sum - 1; i > 0; i--) {
            int temp = sum - i;
            if (i * temp == multi) {
                answer[0] = i;
                answer[1] = temp;
                break;
            }
        }

        return answer;
    }
}
