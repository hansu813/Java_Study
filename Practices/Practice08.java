package 연습문제;

import java.util.ArrayList;

/**
 * packageName    : 연습문제
 * fileName       : Practice08
 * author         : Hansu
 * date           : 2023-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-13        shn81       최초 생성
 * 간단한 편집기
 * 편집기에 문자열과 편집 명령어가 주어지는데 동작은 해당과 같다
 * - L : 커서를 왼쪽으로 한 칸 옮긴다.( 커서가 문장의 맨 앞일 경우 무시 )
 * - D : 커서를 오른쪽으로 한 칸 옮긴다.( 커서가 문장의 맨 끝일 경우 무시 )
 * - B : 커서 왼쪽에 있는 문자를 삭제( 커서가 문장의 맨 앞일 경우 무시 )
 * - P x : x라는 문자를 커서 왼쪽에 추가
 */
public class Practice08 {
    public static String solution(String input, String cmd) {
        StringBuffer sb = new StringBuffer(input);
        ArrayList<String> cmdArr = new ArrayList<>();
        for(String s : cmd.split(" ")) {
            cmdArr.add(s);
        }
        int cursor = input.length();
        int cmdIdx = 0;
        while(cmdIdx != cmdArr.size()) {
            String cur = cmdArr.get(cmdIdx);

            if(cur.equals("L")) {
                cursor = Math.max(0, cursor - 1);
            } else if(cur.equals("D")) {
                cursor = Math.min(sb.length(), cursor + 1);
            } else if(cur.equals("B")) {
                if(cursor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(cursor - 1, cursor);
                cursor = Math.max(0, cursor - 1);
            } else if (cur.equals("P")) {
                String s = cmdArr.get(++cmdIdx);
                sb.insert(cursor, s);
                cursor++;
            }
            cmdIdx++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
