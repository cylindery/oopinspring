package Interface;

interface Speakable {
    double PI = 3.14159;
    final double absoluteZeroPoint = -275.15;

    void sayYes();
}

class Specker implements Speakable {
    public void sayYes() {
        System.out.println("I say NO!!!");
    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println(Speakable.PI);
        System.out.println(Speakable.absoluteZeroPoint);

        Specker reporter1 = new Specker();
        reporter1.sayYes();
    }
}
