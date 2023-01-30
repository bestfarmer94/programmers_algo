package src.level_test2;

//원소의 개수가 n개이고, 중복되는 원소가 없는 튜플 (a1, a2, a3, ..., an)이 주어질 때(단, a1, a2, ..., an은 자연수), 이는 다음과 같이 집합 기호 '{', '}'를 이용해 표현할 수 있습니다.
//
//        {{a1}, {a1, a2}, {a1, a2, a3}, {a1, a2, a3, a4}, ... {a1, a2, a3, a4, ..., an}}
//        예를 들어 튜플이 (2, 1, 3, 4)인 경우 이는
//
//        {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
//        와 같이 표현할 수 있습니다. 이때, 집합은 원소의 순서가 바뀌어도 상관없으므로
//
//        {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
//        {{2, 1, 3, 4}, {2}, {2, 1, 3}, {2, 1}}
//        {{1, 2, 3}, {2, 1}, {1, 2, 4, 3}, {2}}
//        는 모두 같은 튜플 (2, 1, 3, 4)를 나타냅니다.
//
//        특정 튜플을 표현하는 집합이 담긴 문자열 s가 매개변수로 주어질 때, s가 표현하는 튜플을 배열에 담아 return 하도록 solution 함수를 완성해주세요.

//[제한사항]
//        s의 길이는 5 이상 1,000,000 이하입니다.
//        s는 숫자와 '{', '}', ',' 로만 이루어져 있습니다.
//        숫자가 0으로 시작하는 경우는 없습니다.
//        s는 항상 중복되는 원소가 없는 튜플을 올바르게 표현하고 있습니다.
//        s가 표현하는 튜플의 원소는 1 이상 100,000 이하인 자연수입니다.
//        return 하는 배열의 길이가 1 이상 500 이하인 경우만 입력으로 주어집니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

//{{2},{2,1},{2,1,3},{2,1,3,4}}
//        2, 1, 3, 4
public class Q2 {

    public int[] solution(String s) {
        String[] s_replace = s.replaceAll("[{}]", "").split(",");
        int[] arr = new int[100001];
        HashSet<Integer> hash = new HashSet<>();
        System.out.println(Arrays.toString(s_replace));
        for (String s1 : s_replace) {
            arr[Integer.parseInt(s1)]++;
            hash.add(Integer.parseInt(s1));
        }

        int[][] num = new int[hash.size()][];
        int count = 0;

        for (Integer integer : hash) {
            num[count++] = new int[]{integer, arr[integer]};
            System.out.println(Arrays.toString(num[count-1]));
        }
        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int[] answer = new int[num.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num[i][0];
        }

        return answer;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(q2.solution(s)));
    }
}
