package patterns.mediator;

public class JTPoorMan extends Colleague{
    public JTPoorMan(Mediator mediator) {
        super(mediator);
        System.out.println("JTPoorMan signed up for the exchange\n");
    }
}
