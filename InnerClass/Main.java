package 내부클래스;

/**
 * packageName    : 내부클래스
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 */
class Outer {
    public void print() {
        System.out.println("Outer.print");
    }

    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    static class InnerStaticClass {
        void innerPrint() {
//            Outer.this.print();
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    @Override
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Main {

    //    외부 클래스
    Outer o1 = new Outer();

    //    내부 클래스
    Outer.Inner i1 = new Outer().new Inner();

    //    정적 클래스
    Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();

    //    익명 클래스
    Person p1 = new Person() {
        @Override
        public void printInfo() {
            System.out.println("Main.printInfo");
        }
    };
}
