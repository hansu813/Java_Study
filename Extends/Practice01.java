package 상속;

/**
 * packageName    : 상속
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 클래스 및 상속 관계에서 Test code를 수정하지 않고
 * Cat 클래스 내에서 super or super()을 이용하여
 * "고양이 입니다"가 출력 될 수 있도록 변경
 */
class Animal {
    String desc;
    Animal() {
        this.desc = "동물 클래스입니다.";
    }

    Animal(String desc) {
        this.desc = desc;
    }

    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animal {
    String desc;
    Cat() {
        super.desc = "고양이 입니다.";
    }

//    @Override
//    public void printInfo() {
//        System.out.println(desc);;
//    }
}
public class Practice01 {
    public static void main(String[] args) {
//        Test code
        Cat cat = new Cat();
        cat.printInfo();
    }
}
