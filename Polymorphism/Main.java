package 다형성;

/**
 * packageName    : 다형성
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 */
class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    @Override
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollageStudent extends Person {
    @Override
    public void print() {
        System.out.println("CollageStudent.print");
    }
}


public class Main {
    public static void main(String[] args) {
//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();
//        Student s2 = new Person(); X
        p1.print();
        s1.print();
        s1.print2();
        p2.print();

        Person p3 = new CollageStudent();
        p3.print();

//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = pp2; X
        ss1 = (Student)pp3; // 다운캐스팅
        CollageStudent cc1 = null;
        CollageStudent cc2 = new CollageStudent();
//        ss1 = (Student) cc2;
//        cc1 = (CollageStudent) ss2;

//      3. instanceof
        System.out.println("== Instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollageStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student);

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollageStudent);

        if(pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }
        if(st1 instanceof Person) {
            Person per = (Person) st1;
        }
    }
}
