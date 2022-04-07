package factoryMethodPattern;

public class DogToy extends AnimalToy {
    //팩토리 메소드가 생성할 객체
    @Override
    public void identify() {
        System.out.println("나는 테니스공! 강아지의 친구!");
    }
}
