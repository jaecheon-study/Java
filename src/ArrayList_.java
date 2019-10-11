import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        /**
         * <>안에는 자료형이 들어 올 수 있는데 Primitive_Type은 들어 올 수 없고,
         * reference_Type이 올 수 있다.
         * 즉 int, float 등의 타입은 들어 올 수 있다.
         * 만일 int를 넣고 싶다면 int를 사용하여 만든 reference_Type인 Integer를 사용한다.
         * Wrapper Class
         * 그외는 에러를 발생한다.
         */

        int a = 10;
        /**
         * primitive_Type int를 사용 할 때 많이 쓸 것 같은 기능, 필요할 것 같은 기능을
         * 미리 만들어 놓음.
         */
        Integer a1 = 10;

        // reference_Type으로 변경 할 때는 앞에 대문자로 하면 된다. int만 예외적으로 Integer

        boolean b;
        Boolean b1;

        long c;
        Long c1;

        /**
         * primitive_type에는 null이 들어 갈 수 없지만 reference_type에는
         * null이 들어 갈 수 있다.
         * null은 존재 하지 않는다는 의미.
         */

        long item;
//        item = null;

        Long item1;
        item1 = null;


        // ArrayList

        /**
         * 예전 버전에서는 ArrayList<Integer> ints = new ArrayList<Integer>();
         * 라고 뒤에도 자료형을 적어 주었지만 버전이 변경 되면서 뒤에 자료형은 중복성을
         * 가지고 있기 때문에 안적어 주어도 된다.
         */
        // 명시적으로 자료형을 적어준 타입
        ArrayList<Integer> ints = new ArrayList<>();
        // 무엇이든 받겠다는 의미.
        ArrayList ints2 = new ArrayList();

        ints.add(2);
        ints.add(3);

        System.out.println(ints);

        ints2.add(2);
        ints2.add(3);
        ints2.add(true);

        System.out.println(ints2);

        // ArrayList를 만들 때는 목적에 맞게 작성한다.
        // 보통 같은 자료형을 취급하기 때문에 명시적 선언을 많이 사용한다.

       // 기본 배열에서는 length지만 ArrayList는 size이다.
       for (int i = 0; i < ints.size(); i++) {
           if (ints.get(i) == 2) {
               System.out.println("2를 찾음");
           }
       }

       ints.remove(0);
       System.out.println(ints);

    }
}
