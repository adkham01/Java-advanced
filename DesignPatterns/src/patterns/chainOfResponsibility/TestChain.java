package patterns.chainOfResponsibility;

public class TestChain {
    static void main() {
        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubNumbers();
        Chain chain3 = new MultNumbers();
        Chain chain4 = new DivNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain1);

        Numbers request1 = new Numbers(4, 6, "add");
        Numbers request2 = new Numbers(10, 2, "mult");
        Numbers request3 = new Numbers(10, 2, "div");
        Numbers request4 = new Numbers(10, 2, "sub");
        chain1.calculate(request1);
        chain1.calculate(request2);
        chain1.calculate(request3);
        chain1.calculate(request4);
    }
}
