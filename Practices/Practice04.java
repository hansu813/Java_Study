package 연습문제;

/**
 * packageName    : 연습문제
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 여러가지 별 찍기 연습을 해보자.
 * 아래 5가지 타입의 별 찍기가 있다.
 * n = 3
 */
public class Practice04 {
    public static void solution(int n, int type) {
        switch (type) {
            case 1 : type1(n); break;
            case 2 : type2(n); break;
            case 3 : type3(n); break;
            case 4 : type4(n); break;
            case 5 : type5(n); break;
            default: System.out.println("해당 타입이 없습니다."); break;
        }
    }

    public static void type1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void type2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void type3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void type4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void type5(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n / 2; i > 0; i--) {
            for (int j = 0; j < n / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution(3, 1);
    }
}
