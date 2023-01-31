package src.hanghae99;

import java.util.ArrayList;
import java.util.Arrays;

class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> lost_list = new ArrayList<>();
        ArrayList<Integer> reserve_list = new ArrayList<>();
        for (int i : lost) {
            lost_list.add(i);
        }
        for (int i : reserve) {
            reserve_list.add(i);
        }

        for (int k = 0; k < 2; k++) {
            int i = 0, j = 0;
            while (i < lost_list.size() && j < reserve_list.size()) {
                if (Math.abs(lost_list.get(i) - reserve_list.get(j)) == k) {
                    lost_list.remove(i);
                    reserve_list.remove(j);
                    continue;
                }

                if (lost_list.get(i) > reserve_list.get(j)) {
                    j++;
                } else {
                    i++;
                }
            }
        }

        return n - lost_list.size();
    }

    public static void main(String[] args) {
        체육복 s = new 체육복();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = new int[]{1, 3, 5};
        System.out.println(s.solution(n, lost, reserve));
    }
}