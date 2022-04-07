package instanceOf02;   //객체 참조 변수의 타입이 아닌, 실제 객체의 타입에 따라 instanceof 결과를 처리한다!

class 동물 {}

class 조류 extends 동물 {}

class 펭귄 extends 조류 {}

public class Driver {
    public static void main(String[] args) {
        동물 동물객체 = new 동물();
        동물 조류객체 = new 조류();
        동물 펭귄객체 = new 펭귄();

        System.out.println(동물객체 instanceof 동물);

        System.out.println(조류객체 instanceof 동물);
        System.out.println(조류객체 instanceof 조류);

        System.out.println(펭귄객체 instanceof 동물);
        System.out.println(펭귄객체 instanceof 조류);
        System.out.println(펭귄객체 instanceof 펭귄);

        System.out.println(펭귄객체 instanceof Object);
    }
}
