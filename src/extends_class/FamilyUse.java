package extends_class;

public class FamilyUse {

    public static void main(String[] args) {

        // 기본으로 각각의 클래스에 모두 정의
        Father father = new Father();
        Mother mother = new Mother();
        Son son = new Son();

        father.work();
        mother.cook();
        son.study();

        System.out.println("\n");

        // Human을 상속 받은 클래스
        FatherExtends father1 = new FatherExtends();
        MotherExtends mother1 = new MotherExtends();
        SonExtends son1 = new SonExtends();

        father1.work();
        mother1.cook();
        son1.study();

        father1.eat();
        mother1.eat();
        son1.eat();

        // 오버로딩 된 father1 wash() 메소드
        father1.wash("샴푸");
    }

}
