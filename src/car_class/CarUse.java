package car_class;

public class CarUse {
    public static void main(String[] args) {
        // 실체화한 Car class를 normalCar 변수에 할당.
        Car normalCar = new Car(4, "일반엔진", "브레이크", "핸들");
        Car superCar = new Car(4, "슈퍼엔진", true, "브레이크", "핸들");

        normalCar.goForward();
        normalCar.goBackward();

        superCar.goBackward();
        superCar.isSuperCar();

    }
}
