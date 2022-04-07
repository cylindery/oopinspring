package singletonPattern;

public class Client {
    public static void main(String[] args) {
//        private 생성자 때문에 new를 통해 인스턴스 생성 불가
//        Singleton singleton = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        singleton1 = null;
        singleton2 = null;
        singleton3 = null;
    }
}
