package design_patterns.structual.structual.proxy;

public class Proxy extends RealSubject{
    @Override
    public void method() {
        System.out.println("I am a Proxy, I will preform auth security checks");
        super.method();
    }

}
