package src.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int[] read = new int[citations[citations.length-1]+1];
        Set<Integer> hash = new HashSet<>();
        for(int i: citations){
            read[i]++;
            hash.add(i);
        }

        int count = 0;
        for(int i=citations[citations.length-1]; i>=0; i--){
            if(hash.contains(i)){
                count += read[i];
            }
            if(count >= i){
                answer = i;
                break;
            }

        }

        return answer;
    }
}