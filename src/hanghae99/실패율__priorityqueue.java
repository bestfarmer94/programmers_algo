package src.hanghae99;

import java.util.PriorityQueue;

class Rate implements Comparable<Rate> {
    int stage;
    double rate;

    Rate(int stage, double rate) {
        this.stage = stage;
        this.rate = rate;
    }

    @Override
    public int compareTo(Rate o1) {
        if (this.rate > o1.rate) {
            return -1;
        }
        if (this.rate < o1.rate) {
            return 1;
        }
        return this.stage - o1.stage;
    }
}

class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] now_stage = new int[N + 2];

        for (int i = 0; i < stages.length; i++) {
            now_stage[stages[i]]++;
        }

        PriorityQueue<Rate> pq = new PriorityQueue<Rate>();
        int total = stages.length;

        for (int i = 1; i < N + 1; i++) {
            double rate = ((double) now_stage[i]) / total;
            total -= now_stage[i];
            pq.add(new Rate(i, rate));
        }

        answer = new int[pq.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = pq.poll().stage;
        }
        return answer;
    }

    public static void main(String[] args) {
        실패율 s = new 실패율();
        int n = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(s.solution(n, stages));
    }
}