package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * packageName    : 입출력
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-09        shn81       최초 생성
 */
public class Main {
    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력 : ");
        int a = System.in.read() - '0';
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]);

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.print("입력 : ");
        reader.read(c);
        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String s1 = br.readLine();
        System.out.println(s1);
    }

    public static void main(String[] args) throws IOException {
//      Test code
//      1. 입력
//      1-1. 다른 입력 방식 참고
//      referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner in = new Scanner(System.in);
//        System.out.print("입력1 : ");
//        System.out.println(in.next());
//        in.nextLine();

//        System.out.print("입력2 : ");
//        System.out.println(in.nextInt());
//        in.nextLine();

//        System.out.print("입력3 : ");
//        System.out.println(in.nextLine());

//      참고) 정수, 문자열 변환
//        int num = Integer.parseInt("12345");
//        String str = Integer.toString(12345);
//        System.out.println(num);
//        System.out.println(str);

//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "Java";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number+ "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);

        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10);
        System.out.printf("%x\n", 10);

        System.out.printf("%f\n", 5.2f);
        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "안녕하세요!");

        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        System.out.printf("%.2f\n", 1.127456);
    }
}
