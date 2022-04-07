package factoryMethodPattern;   //팩토리 메소드 패턴은 결국 오버라이드된 메소드가 객체를 반환하는 패턴이다.

public abstract class Animal {
    //추상 팩토리 메소드
    public abstract AnimalToy getToy();
}
