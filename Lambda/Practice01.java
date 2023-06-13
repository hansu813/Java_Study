package 람다식;

/**
 * packageName    : 람다식
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 */
interface CompareTool {
    public abstract int getMaxNum(int num1, int num2);
}

public class Practice01 {
    public static void main(String[] args) {
//      Test code
        ComputeTool ct = (num1, num2) -> {return num1 > num2? num1 : num2; };
        System.out.println(ct.compute(10, 11));
    }

}
