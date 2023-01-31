package src.hanhae_test;

public class Q2 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr2[i] >= 29 ? 21 : arr2[i];
            answer += arr2[i] - arr1[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Q2 method = new Q2();
        int[] arr1 = {9, 7, 8, 9, 7, 9, 8};
        int[] arr2 = {23, 22, 26, 26, 29, 27, 22};
        System.out.println(method.solution(arr1, arr2));
    }
}
