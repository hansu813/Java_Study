package 연습문제;

/**
 * packageName    : 연습문제
 * fileName       : Practice09
 * author         : Hansu
 * date           : 2023-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-13        shn81       최초 생성
 */
public class Practice09 {
    final static int BACK_SPACE = 8;
    final static int SHIFT = 16;
    final static int CAPS_LOCK = 20;
    final static int SPACE_BAR = 32;
    final static int KEY_LEFT = 37;
    final static int KEY_RIGHT = 39;
    final static int INSERT = 155;
    final static int DELETE = 127;

    public static String solution(int[] keyLog) {
        StringBuffer sb = new StringBuffer();

        int step = (int) ('a' - 'A');

        int curSor = 0;
        int cmdIdx = 0;
        boolean isShift = false;
        boolean isCapsLock = false;
        boolean isInsert = false;
        while(cmdIdx != keyLog.length) {
            int cur = keyLog[cmdIdx];

            if(cur == BACK_SPACE) {
                if(curSor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor - 1, curSor);
                curSor = Math.max(0, curSor - 1);
            } else if (cur == SHIFT) {
                isShift = true;
            } else if (cur == CAPS_LOCK) {
                isCapsLock = !isCapsLock;
            } else if (cur == SPACE_BAR) {
                inputData(sb, ' ', curSor, isInsert);
                curSor++;
            } else if (cur == KEY_LEFT) {
                curSor = Math.max(0, curSor - 1);
            } else if (cur == KEY_RIGHT) {
                curSor = Math.min(sb.length(), curSor + 1);
            } else if (cur == INSERT) {
                isInsert = !isInsert;
            } else if (cur == DELETE) {
                if(curSor == sb.length()) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor, curSor + 1);
            } else if (cur >= 97 && cur <= 122) {
                int data = cur;

                if(isCapsLock && isShift) {
                    data = cur;
                } else if (isCapsLock || isShift) {
                    data -= step;
                }
                inputData(sb, (char)data, curSor, isInsert);
                isShift = false;
                curSor++;
            } else if(cur >= 48 && cur <= 57) {
                if(isShift) {
                    char[] specialKey = {')', '!', '@', '#', '$', '%', '^', '&', '*', '('};
                    inputData(sb, specialKey[cur - '0'], curSor, isInsert);
                } else {
                    inputData(sb, (char) cur, curSor, isInsert);
                }

                isShift = false;
                curSor++;
            }
            cmdIdx++;
        }

        return sb.toString();
    }

    public static void inputData(StringBuffer sb, char data, int curSor, boolean IsInsert) {
        if (!IsInsert) {
            sb.insert(curSor, data);
        } else {
            sb.setCharAt(curSor, data);
        }
    }

    public static void main(String[] args) {
        int[] keyLog = {16, 106, 101, 108, 108, 111, 37, 37, 37, 37, 37, 155, 16, 104};
        System.out.println(solution(keyLog));
    }
}
