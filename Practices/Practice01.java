package 연습문제;

/**
 * packageName    : 연습문제
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 정수 자료형의 숫자를 거꾸로 변환하는 프로그램을 작성하시오.
 */
public class Practice01 {
    public static int solution(int n) {
        boolean checkPlus = true;
        if(n < 0) {
            checkPlus = false;
            n *= -1;
        }
        StringBuilder sb = new StringBuilder(Integer.toString(n)).reverse();
        if(!checkPlus) {
            return Integer.parseInt(sb.toString()) * -1;
        }
        return Integer.parseInt(sb.toString());
    }

    public static int solution2(int n) {
        int answer = 0;
        boolean checkMinus = false;
        if(n < 0) {
            checkMinus = true;
            n *= -1;
        }
        while(n != 0) {
            int target = n % 10;
            answer = answer * 10 + target;
            n /= 10;
        }
        return checkMinus? answer * -1 : answer;
    }
    public static void main(String[] args) {
        int n1 = 12345;
        System.out.println(solution(n1));
        System.out.println(solution2(n1));

        int n2 = -12345;
        System.out.println(solution(n2));
        System.out.println(solution2(n2));

        int n3 = 100;
        System.out.println(solution(n3));
        System.out.println(solution2(n3));
    }
}
