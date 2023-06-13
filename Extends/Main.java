package 상속;

/**
 * packageName    : 상속
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * Java Programming 상속
 */
class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void pringInfo() {
        System.out.println("Persom.printInfo");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}

class Student extends Person {
    Student() {
        a1 = 1;
    }
}

class Student2 extends Person {
    String name;
    int stdId;

    Student2(String name, int age, int stdId) {
//        this.name = name;
//        super.name = name;
        super(name, age);
        this.age = age;
        this.stdId = stdId;
    }

    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("stdId : " + stdId);
    }
}


public class Main {
    public static void main(String[] args) {
//      Test code
        System.out.println("==========");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.pringInfo();

//      super, super(), overriding
        System.out.println("==========");
        Student2 s2 = new Student2("b", 32, 1);
        s2.pringInfo();
    }
}
