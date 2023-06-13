package 람다식;

/**
 * packageName    : 람다식
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 */
interface ComputeTool {
    public abstract  int compute(int x, int y);

//    public abstract int compute1(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        ComputeTool computeTool = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        System.out.println(computeTool.compute(1, 2));
//      람다식
        ComputeTool computeTool2 = (x, y) -> {return x + y;};
        System.out.println(computeTool2.compute(1, 2));
    }
}
