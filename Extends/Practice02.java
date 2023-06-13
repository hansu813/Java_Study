package 상속;

/**
 * packageName    : 상속
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 클래스와 상속 관계에서
 * Test code를 수정하지 않고, 아래와 같이 출력할 수 있도록
 * 오버라이딩을 해보시오.
 * 빵빵!
 * 위이잉!
 * 빵빵!
 * 삐뽀삐뽀!
 */
class Car {
    Car(){}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    @Override
    public void horn() {
        super.horn();
        System.out.println("위이잉!");;
    }
}

class Ambulance extends Car {
    @Override
    public void horn() {
        super.horn();
        System.out.println("삐뽀삐뽀!");
    }
}

public class Practice02 {
    public static void main(String[] args) {
//        Test code
        FireTruck truck = new FireTruck();
        truck.horn();

        Ambulance ambulance = new Ambulance();
        ambulance.horn();
    }
}
