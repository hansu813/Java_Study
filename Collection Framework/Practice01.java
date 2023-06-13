package 컬렉션프레임워크;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * packageName    : 컬렉션프레임워크
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 */
public class Practice01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }

        LinkedList<Integer> list = new LinkedList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
