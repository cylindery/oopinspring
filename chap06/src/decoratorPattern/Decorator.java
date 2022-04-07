package decoratorPattern;

public class Decorator implements IService {
    IService service1;

    public String runSomething() {
        System.out.println("호출에 대한 장식 주목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");

        //합성. 실제 서비스에 대한 참조 변수를 갖는다.
        service1 = new Service();
        return "정말 " + service1.runSomething();
    }
}
