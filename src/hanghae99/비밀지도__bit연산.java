package src.hanghae99;

class 비밀지도__bit연산 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i])
                    .replace("1", "#").replace("0", " ");
            while(answer[i].length() < n){
                answer[i] = " " + answer[i];
            }
        }
        return answer;
    }
}