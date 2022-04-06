package polymorphism01;

public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showName("초보람보");
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        pingu.showName();   //자동 타입 변환을 사용해도, 재정의된 메소드는 하위 클래스의 오버라이딩을 따른다.
    }
}
