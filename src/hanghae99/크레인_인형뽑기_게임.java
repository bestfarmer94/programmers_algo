package src.hanghae99;

import java.util.Stack;

class 크레인_인형뽑기_게임 {
    static int answer;
    static Stack<Integer> toy;
    //
    public int solution(int[][] board, int[] moves) {
        toy = new Stack<>();

        for (int move : moves) {
            crane(board, move);
        }
        return answer;
    }

    void crane(int[][] board, int move) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][move - 1] != 0) {
                bomb(board[i][move - 1]);
                board[i][move - 1] = 0;
                break;
            }
        }
    }

    void bomb(int number) {
        if (!toy.empty() && number == toy.peek()) {
            toy.pop();
            answer += 2;
        } else {
            toy.add(number);
        }
    }

    public static void main(String[] args) {
        크레인_인형뽑기_게임 s = new 크레인_인형뽑기_게임();
        int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(s.solution(board, moves));
    }
}
