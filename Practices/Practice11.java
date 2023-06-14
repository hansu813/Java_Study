package 연습문제;

import java.util.Arrays;

/**
 * packageName    : 연습문제
 * fileName       : Practice11
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 * 정수형 오름차순 데이터가 nums라는 배열에 주어진다.
 * 현재 배열 내에 중복된 데이터가 들어있을 경우 해당 중복들을 제거하는 프로그램을 작성
 * nums 배열 하나만 사용해서 중복 제거
 */
public class Practice11 {
    public static void solution(int[] nums) {
        int idx = 0;
        for(int num : nums) {
            if(idx == 0 || num > nums[idx - 1]) {
                nums[idx++] = num;
            }
        }
        System.out.print("[" + idx + "] ");
        for(int i = 0; i < idx; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        solution(nums);

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4};
        solution(nums);
    }
}
