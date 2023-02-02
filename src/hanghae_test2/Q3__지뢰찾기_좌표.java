package src.hanghae_test2;

import java.util.Arrays;

class Q3__지뢰찾기_좌표 {
    public char[][] solution(int N, char[][] ary) {
        int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] y = {0, 0, 1, -1, 1, -1, 1, -1};
        char[][] answer = new char[N][N];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = ary[i][j] == '.' ? find_mine(ary, i, j, x, y) : '*';
            }
        }

        return answer;
    }

    char find_mine(char[][] ary, int i, int j, int[] x, int[] y) {
        int count = 0;
        for (int k = 0; k < x.length; k++) {
            int nx = i + x[k];
            int ny = j + y[k];
            if (in_array(nx, ny, ary) && ary[nx][ny] != '.') {
                count += ary[nx][ny] - '0';
            }
        }
        System.out.println(count);
        return count > 9 ? 'M' : (char) (count + '0');
    }

    boolean in_array(int nx, int ny, char[][] ary) {
        return nx >= 0 && ny >= 0 && nx < ary.length && ny < ary.length;
    }

    public static void main(String[] args) {
        Q3__지뢰찾기_좌표 method = new Q3__지뢰찾기_좌표();
        int N = 4;
        char[][] chars =
                {{'2', '.', '.', '.',},
                        {'.', '.', '9', '.'},
                        {'.', '3', '.', '2'},
                        {'.', '4', '.', '.'}};
        System.out.println(Arrays.deepToString(method.solution(N, chars)));
    }
}
