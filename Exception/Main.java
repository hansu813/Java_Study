package 예외처리;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * packageName    : 예외처리
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 */
class NotTenException extends RuntimeException {}

public class Main {

    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }
        return true;
    }

    public static boolean checkTenWithException(int ten) {
        if (ten != 10) {
            throw new NotTenException();
        }
        return true;
    }


    public static void main(String[] args) {
//      1. 예외
//      1-1. 0으로 나누기
        System.out.println("== 0으로 나누기 ==");
//        int a = 5 / 0;
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
            System.out.printf("e = " + e);
        } finally {
            System.out.printf("1-1 연습 종료");
        }

//      1-2. 배열 인덱스 처리
        System.out.println("== 배열 인덱스 초과 ==");
        int[] b = new int[4];
//        b[4] = 1;
        try {
            b[4] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 초과");
            System.out.println("e = " + e);
        } finally {
            System.out.println("1-2 연습 종료");
        }

//      1-3. 없는 파일 열기
        System.out.println("== 없는 파일 열기 ==");
//      BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

//      2. throw, throws
        System.out.println("== checkTen ==");
        boolean checkResult = Main.checkTen(10);
        System.out.println("checkResult : " + checkResult);

        System.out.println("== checkTenWithException ==");
        checkResult = Main.checkTenWithException(9);
    }

}
