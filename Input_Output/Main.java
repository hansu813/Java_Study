package 파일입출력;

import java.io.*;

/**
 * packageName    : 파일입출력
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 */
public class Main {
    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt");
        String memo = "헤드 라인 \n";
        fw.write(memo);

        memo = "1월 1일 날씨 맑음";
        fw.write(memo);

        fw.close();

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo.txt");
        memo = "헤드 라인";
        pw.println(memo);

        memo = "1월 1일 날씨 흐림";
        pw.println(memo);

        pw.close();

//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true);

        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);

        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true));
        memo = "1월 3일 날씨 또 맑음!";
        pw2.println(memo);
        pw2.close();

//      2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            }
            System.out.println(line);
        }
        br.close();


    }
}
