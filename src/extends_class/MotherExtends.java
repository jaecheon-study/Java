package extends_class;

public class MotherExtends extends Human {

    public MotherExtends() {

    }

    public void cook() {
        System.out.println("요리한다");
    }

    // override
    @Override
    public void eat() {
        System.out.println("적게 먹는다");
    }
}
