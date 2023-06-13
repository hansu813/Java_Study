package 연습문제;

/**
 * packageName    : 연습문제
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 자바의 String 자료형에는 많은 연산자 기능들이 있다.
 * 프로그래밍의 기본기를 익히기 위해 일부 연산자들을 재한하고 다음의 기능을
 * 구현하려 한다.
 * String의 replace 기능 구현
 * String의 replace, indexOf, contains를 사용하지 않고 구현
 */
public class Practice03 {
    public static String solution(String str, String before, String after) {
        char checkChar = before.charAt(0);
        boolean checkStr = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == checkChar) {
                for(int j = 0; j < before.length(); j++) {
                    if(str.charAt(i + j) != before.charAt(j)) {
                        break;
                    }
                    checkStr = true;
                }
                if(checkStr) {
                    sb.append(after);
                    i += before.length();
                }
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello java, nice to meet you! java is fun!", "java", "자바"));
    }
}
