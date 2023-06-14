package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * packageName    : 연습문제
 * fileName       : Practice13
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 * 정렬된 정수형 배열 arr이 주어졌을 때, 다음을 구하는 프로그램을 작성하시오.
 * - arr와 함께 k와 x가 주어진다.
 * - x와 절대값 차이 기준을 가까운 수를 k개수 만큼 정렬된 순서로 출력
 * - 절대 값 차이가 같을 때는 숫자가 작은 것이 먼저 출력되도록 한다.
 */
public class Practice13 {
    public static void solution(int[] arr, int k, int x) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int diff = Math.abs(x - arr[i]);
            ArrayList<Integer> cur = map.get(diff);
            if(cur == null) {
                map.put(diff, new ArrayList<>(Arrays.asList(arr[i])));
            } else {
                int idx = cur.size();
                for(int j = 0; j < cur.size(); j++) {
                    if(cur.get(j) > arr[i]){
                        idx = j;
                        break;
                    }
                }
                cur.add(idx, arr[i]);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int cnt = 0;
        while (map.size() > 0) {
            int minDiff = map.keySet().stream().min((a, b) -> a - b).get();
            ArrayList<Integer> cur = map.get(minDiff);
            map.remove(minDiff);
            while (cur.size() > 0) {
                result.add(cur.get(0));
                cur.remove(0);
                cnt++;
                if(cnt == k) {
                    break;
                }
            }
            if(cnt == k) {
                break;
            }
        }

        Collections.sort(result);
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr, 4, 3);
    }
}
