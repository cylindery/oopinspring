package factoryMethodPattern;

public class Cat extends Animal {
    //추상 팩토리 메소드 오버라이딩
    @Override
    public AnimalToy getToy() {
        return new CatToy();
    }
}
