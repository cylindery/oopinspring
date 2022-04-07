package factoryMethodPattern;

public class CatToy extends AnimalToy {
    //팩토리 메소드가 생성할 객체
    @Override
    public void identify() {
        System.out.println("나는 캣타워! 고양이의 친구");
    }
}
