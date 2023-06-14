package 연습문제;

import java.util.ArrayList;

/**
 * packageName    : 연습문제
 * fileName       : Practice12
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 * 주어진 nums 배열에서 두 번 나타나는 모든 정수의 배열을 반환하는 프로그램을 작성
 * - 배열은 1 ~ n 범위의 정수로 이루어져 있다.
 * - 각 정수는 한 번 또는 두 번 나타날 수 있다.
 * 반환을 위한 메모리 공간 외의 추가적인 배열을 사용하지 않는다.
 */
public class Practice12 {
    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0) {
                list.add(Math.abs(idx + 1));
            }
            nums[idx] = -nums[idx];
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(solution(nums));
    }
}
