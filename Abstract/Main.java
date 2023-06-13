package 추상클래스;

/**
 * packageName    : 추상클래스
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 */
abstract class Person {
    abstract void printInfo();
}

class Student extends Person {
    @Override
    void printInfo() {
        System.out.println("Student.printinfo");
    }
}

public class Main {
    public static void main(String[] args) {
//      추상 클래스의 사용
//        Person p1 = new Person();
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Person.Info");
            }
        };
        p2.printInfo();
    }
}
