package 연습문제;

/**
 * packageName    : 연습문제
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 아스키 코드 중 알파벳에 대해서 사용자가 입력한 알파벳의 대소문자를 변경하는 프로그램을 작성하시오.
 */
public class Practice02 {
    public static char solution(char c) {
        char answer = 0;
        if(c - 'a' >= 0 && c - 'z' <= 0) {
            answer = (char)(c - 32);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution('a'));
        System.out.println(solution('b'));
        System.out.println(solution('c'));
        System.out.println(solution('d'));
    }
}
