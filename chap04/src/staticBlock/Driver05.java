package staticBlock;

public class Driver05 {
    public static void main(String[] args) {
        System.out.println("main 메소드 시작!");
        System.out.println(Animal.age);
    }
}

class Animal {
    static int age;

    static {
        System.out.println("Animal class ready on!");
    }
}
