package extends_class;

public class SonExtends extends Human {

    public SonExtends() {

    }

    public void study() {
        System.out.println("공부한다");
    }

    // override
    @Override
    public void eat() {
        System.out.println("너무 많이 먹는다");
    }

}
