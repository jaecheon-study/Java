package car_class;

public class Car {

    // 자동차의 부품들. 클래스 변수
    int tires;
    String engine;
    Boolean superEngine;
    String break_; // break는 예약어라 변수 사용 불가.
    String handle;

    /**
     * 클래스를 인스턴스화 시킬 생성자.
     * 기본 생성자는 적지 않아도 (코드에 없어도) 자동 생성 된 것으로 인식한다.
     * 다만 파라미터를 받는 생성자가 있고, 기본 생성자를 사용하려면, 기본 생성자를 반듯이
     * 작성해주어야 한다.
     * 2가지 특징.
     * 클래스 명과 이름이 같고, 리턴 타입이 없다.
     */
    public Car(int tires, String engine, String break_, String handle) {
        // 실체화 하며, 자동차가 만들어지는 과정을 나타냄. 즉 조립.

        /**
         * this는 클래스 변수를 가르킴.
         * this는 자기 자신을 의미. 자기 자신은 해당 class
         */
        this.tires = tires;
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
    }

    public Car(int tires, String engine, Boolean superEngine, String break_, String handle) {
        this.tires = tires;
        this.engine = engine;
        this.superEngine = superEngine;
        this.break_ = break_;
        this.handle = handle;
    }

    // 자동차의 기능들 method로 기능 구현
    public void goForward() {
        System.out.println("직진");
    }

    public void goBackward() {
        System.out.println("후진");
    }

    public void isSuperCar() {
        if (superEngine == true) {
            System.out.println("슈퍼카");
        } else {
            System.out.println("보통카");
        }
    }
}