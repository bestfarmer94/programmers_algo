package src.level2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int weight = people[right--];
            if (weight + people[left] <= limit) {
                left++;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        구명보트 s = new 구명보트();
        int[] people = new int[]{70, 50, 80, 50};
        int limit = 100;
        System.out.println(s.solution(people, limit));
    }
}
