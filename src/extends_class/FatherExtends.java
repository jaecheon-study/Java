package extends_class;

public class FatherExtends extends Human{

    public FatherExtends() {

    }

    public void work() {
        System.out.println("일한다");
    }

    // override
    @Override
    public void eat() {
        // 부모의 eat() 메소드를 가르킴 즉 super는 부모를 의미한다.
//        super.eat(); // Human.eat();
        System.out.println("많이 먹는다");
    }

    // Human class에 있는 wash() 메소드 오버로딩
    public void wash(String shampoo) {
        System.out.println(shampoo + "로 머리 감는다");
    }
}
