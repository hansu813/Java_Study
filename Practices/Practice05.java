package 연습문제;

/**
 * packageName    : 연습문제
 * fileName       : Practice05
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * n개의 데이터가 height 배열에 주어졌다.
 * height 배열의 각각 원소는 벽에 대한 높이를 의미한다.
 * 이 중 어떤 두 벽을 고르면 가장 많은 물을 담을 수 있는지 확인하고
 * 면적을 출력
 */
public class Practice05 {
    public static int solution(int[] height) {
        int minHeight = 0;
        int max = -1;
        for(int i = 0; i < height.length; i++) {
            for(int j = height.length - 1; j > i; j--) {
                minHeight = Math.min(height[i], height[j]);
                if(minHeight * (j - i) > max) {
                    max = minHeight * (j - i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(arr));
    }
}
