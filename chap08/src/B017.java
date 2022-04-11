public class B017 {
    public static void main(String[] args) {
        System.out.format("정적 상수: %d\n", MyFunctionalInterface2.constant);

        MyFunctionalInterface2.concreteStaticMethod();

        MyFunctionalInterface2 mfi2 = () -> System.out.println("추상 인스턴스 메소드");

        mfi2.abstractInstanceMethod();

        mfi2.concreteInstanceMethod();

    }
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    //정적 상수
    public static final int constant = 1;

    //추상 인스턴스 메소드
    public abstract void abstractInstanceMethod();

    //구체 인스턴스 메소드
    public default void concreteInstanceMethod() {
        System.out.println("디폴트 메소드 - 구체 인스턴스 메소드");
    }

    //구체 정적 메소드
    public static void concreteStaticMethod() {
        System.out.println("정적 메소드 - 구체 정적 메소드");
    }
}
