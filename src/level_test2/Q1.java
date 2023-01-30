package src.level_test2;

//마을의 개수 N, 각 마을을 연결하는 도로의 정보 road, 음식 배달이 가능한 시간 K가 매개변수로 주어질 때,
//        음식 주문을 받을 수 있는 마을의 개수를 return 하도록 solution 함수를 완성해주세요.
//
//        제한사항
//        마을의 개수 N은 1 이상 50 이하의 자연수입니다.
//        road의 길이(도로 정보의 개수)는 1 이상 2,000 이하입니다.
//        road의 각 원소는 마을을 연결하고 있는 각 도로의 정보를 나타냅니다.
//        road는 길이가 3인 배열이며, 순서대로 (a, b, c)를 나타냅니다.
//        a, b(1 ≤ a, b ≤ N, a != b)는 도로가 연결하는 두 마을의 번호이며
//        , c(1 ≤ c ≤ 10,000, c는 자연수)는 도로를 지나는데 걸리는 시간입니다.
//        두 마을 a, b를 연결하는 도로는 여러 개가 있을 수 있습니다.
//        한 도로의 정보가 여러 번 중복해서 주어지지 않습니다.
//        K는 음식 배달이 가능한 시간을 나타내며, 1 이상 500,000 이하입니다.
//        임의의 두 마을간에 항상 이동 가능한 경로가 존재합니다.
//        1번 마을에 있는 음식점이 K 이하의 시간에 배달이 가능한 마을의 개수를 return 하면 됩니다.

import java.util.*;
class Q1 {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[] distance = new int[N + 1];

        PriorityQueue<Dijkstra> pq = new PriorityQueue<>();
        pq.add(new Dijkstra(0, 1));
        int inf = 123456789;
        Arrays.fill(distance, inf);
        distance[1] = 0;

        while (pq.size() != 0) {
            Dijkstra d = pq.poll();
            for (int i = 0; i < road.length; i++) {
                if (road[i][0] == d.start || d.start == road[i][1]) {
                    int to = road[i][0] == d.start ? road[i][1] : road[i][0];
                    int new_distance = road[i][2] + d.distance;
                    if (new_distance < distance[to]) {
                        distance[to] = new_distance;
                        pq.add(new Dijkstra(new_distance, to));
                    }
                }
            }
        }

        for (int i = 1; i < distance.length; i++) {
            if(distance[i] <= K){
                answer++;
            }
        }
        return answer;
    }
}

class Dijkstra implements Comparable<Dijkstra> {
    int distance;
    int start;

    Dijkstra(int distance, int start) {
        this.distance = distance;
        this.start = start;
    }

    @Override
    public int compareTo(Dijkstra o1) {
        return this.distance - o1.distance;
    }
}
