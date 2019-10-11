package interface_exam;

public class Mother implements HumanInterface {
    @Override
    public void eat() {
        System.out.println("어머니가 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("어머니가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("어머니가 씻는다");
    }
}
