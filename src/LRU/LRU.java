package src.LRU;

import java.util.*;

//  solution 1
//        테스트 1 〉	    통과 (0.52ms, 73.9MB)
//        테스트 2 〉	    통과 (0.15ms, 75.4MB)
//        테스트 3 〉	    통과 (0.56ms, 71.4MB)
//        테스트 4 〉	    통과 (0.48ms, 75.2MB)
//        테스트 5 〉	    통과 (0.22ms, 73MB)
//        테스트 6 〉	    통과 (0.05ms, 74.9MB)
//        테스트 7 〉	    통과 (0.16ms, 78MB)
//        테스트 8 〉	    통과 (0.12ms, 76.6MB)
//        테스트 9 〉	    통과 (0.43ms, 77.6MB)
//        테스트 10 〉	통과 (1.08ms, 73.7MB)
//        테스트 11 〉	통과 (46.77ms, 127MB)
//        테스트 12 〉	통과 (0.81ms, 71.3MB)
//        테스트 13 〉	통과 (1.61ms, 81.2MB)
//        테스트 14 〉	통과 (1.82ms, 78.6MB)
//        테스트 15 〉	통과 (1.93ms, 83.8MB)
//        테스트 16 〉	통과 (3.54ms, 89MB)
//        테스트 17 〉	통과 (1.66ms, 84.2MB)
//        테스트 18 〉	통과 (3.71ms, 76.3MB)
//        테스트 19 〉	통과 (2.64ms, 79.4MB)
//        테스트 20 〉	통과 (3.12ms, 81MB)

//  solution 2
//        테스트 1 〉	    통과 (0.21ms, 81.4MB)
//        테스트 2 〉	    통과 (0.13ms, 67MB)
//        테스트 3 〉	    통과 (0.38ms, 77.7MB)
//        테스트 4 〉	    통과 (0.21ms, 77.9MB)
//        테스트 5 〉	    통과 (0.16ms, 63.8MB)
//        테스트 6 〉	    통과 (0.23ms, 76.9MB)
//        테스트 7 〉	    통과 (0.24ms, 90.4MB)
//        테스트 8 〉	    통과 (0.26ms, 72.4MB)
//        테스트 9 〉	    통과 (0.31ms, 84.9MB)
//        테스트 10 〉	통과 (0.55ms, 78.9MB)
//        테스트 11 〉	통과 (34.59ms, 108MB)
//        테스트 12 〉	통과 (0.35ms, 75.5MB)
//        테스트 13 〉	통과 (0.88ms, 72.9MB)
//        테스트 14 〉	통과 (1.35ms, 77.2MB)
//        테스트 15 〉	통과 (1.72ms, 79.5MB)
//        테스트 16 〉	통과 (1.85ms, 75.2MB)
//        테스트 17 〉	통과 (1.74ms, 73.7MB)
//        테스트 18 〉	통과 (2.45ms, 85.1MB)
//        테스트 19 〉	통과 (2.53ms, 76.7MB)
//        테스트 20 〉	통과 (2.86ms, 83.6MB)

class TestcaseGenerator {
    static int N = 10000;
    static int capacity = 100000;
    static String[] cities;

    public static String generateRandomCityName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; ++i) {
            int randomValue = (int) (Math.random() * 26);
            sb.append((char) (randomValue + 'a'));
        }
        return sb.toString();
    }

    public static void setCities() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            arrayList.add(generateRandomCityName());
        }
        cities = arrayList.toArray(new String[0]);
    }
}

class Solution {
    public void go(Set<String> cache, int capacity, String city, int[] answer) {
        if (capacity == 0) {
            answer[0] += 5;
            return;
        }

        if (cache.contains(city)) {
            cache.remove(city);
            cache.add(city);
            answer[0] += 1;
        } else {
            if (cache.size() == capacity) {
                String firstKey = cache.iterator().next();
                cache.remove(firstKey);
            }
            cache.add(city);
            answer[0] += 5;
        }
    }

    public int solution(int cacheSize, String[] cities) {
        Set<String> cache = new LinkedHashSet<>();

        int[] answer = {0};
        for (String city : cities) {
            go(cache, cacheSize, city.toLowerCase(), answer);
        }

        return answer[0];
    }

    public int solution2(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String str = cities[i].toUpperCase();
            if (q.contains(str)) {
                q.remove(str);
                q.add(str);
                answer += 1;
            } else {
                answer += 5;
                q.add(str);
                if (q.size() > cacheSize) {
                    q.poll();
                }
            }
        }
        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        TestcaseGenerator.setCities();
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        // hash
        solution.solution(TestcaseGenerator.capacity, TestcaseGenerator.cities);
        long end = System.currentTimeMillis();
        System.out.println("solution: " + ((end - start) / 1000.0f));

        TestcaseGenerator.setCities();
        start = System.currentTimeMillis();
        // Queue
        solution.solution2(TestcaseGenerator.capacity, TestcaseGenerator.cities);
        end = System.currentTimeMillis();
        System.out.println("solution2: " + ((end - start) / 1000.0f));
    }
}