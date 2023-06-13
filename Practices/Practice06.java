package 연습문제;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : 연습문제
 * fileName       : Practice06
 * author         : Hansu
 * date           : 2023-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-13        shn81       최초 생성
 * 로마 숫자 표기를 정수형으로 변환하는 프로그램
 * 로마 숫자는 I, V, X, L, C, D, M으로 이루어져 있다.
 */
public class Practice06 {
    public static int solution(String roman) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500); map.put('M', 1000);
        for(int i = 0; i < roman.length() - 1; i++) {
            if(map.get(roman.charAt(i)) < map.get(roman.charAt(i + 1))) {
                result -= map.get(roman.charAt(i));
            } else {
                result += map.get(roman.charAt(i));
            }
        }

        return result + map.get(roman.charAt(roman.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(solution("III"));
        System.out.println(solution("VI"));
        System.out.println(solution("IV"));
        System.out.println(solution("XIII"));
        System.out.println(solution("XXVI"));
        System.out.println(solution("MCMXCIV"));
    }
}
