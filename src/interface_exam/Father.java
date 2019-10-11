package interface_exam;

import extends_class.Human;

// 인터페이스 구현 (implements)
public class Father implements HumanInterface {

    @Override
    public void eat() {
        System.out.println("아버지가 많이 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("아버지가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("아버지가 씻는다");
    }

}
