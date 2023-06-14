package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : 연습문제
 * fileName       : Practice14
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 * 2차원 정수형 배열 matrix 가 주어지면
 * 나선형 모양으로 출력하는 프로그램을 작성하세요.
 */
public class Practice14 {
    public static ArrayList solution(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i = rowStart; i<=rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colStart <= colEnd) {
                for(int i = rowEnd; i >- rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(solution(matrix));
    }
}
