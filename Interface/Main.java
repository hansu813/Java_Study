package 인터페이스;

/**
 * packageName    : 인터페이스
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 인터페이스
 */
interface School {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}

class Student implements School {
    @Override
    public void printSchool() {
        System.out.println("00 University");
    }
}

class Person {
    public String name;
    public void printName() {
        System.out.println("name : " + name);
    }
}

class Student2 extends Person implements School {
    Student2(String name) {
        super.name = name;
    }
    @Override
    public void printSchool() {
        System.out.println("11 University");
    }
}

public class Main {
    public static void main(String[] args) {
//      1. interface 사용
        System.out.println("== 기본 인터페이스 ==");
        Student s1 = new Student();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);

//      2. 다중 상속처럼 사용
        System.out.println("== 다중 상속처럼 ==");
        Student2 st2 = new Student2("A");
        st2.printSchool();
        st2.printName();
    }
}
