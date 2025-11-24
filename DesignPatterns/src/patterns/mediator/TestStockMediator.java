package patterns.mediator;

public class TestStockMediator {
    static void main() {
        StockMediator mediator = new StockMediator();
        GormanSlacks broker = new GormanSlacks(mediator);
        JTPoorMan trader = new JTPoorMan(mediator);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        trader.buyOffer("MSFT", 100);
        trader.buyOffer("NRG", 50);

        broker.buyOffer("NRG", 100);
        broker.buyOffer("GOOG", 50);

        trader.saleOffer("MSFT", 100);
        trader.saleOffer("NRG", 50);

        mediator.getStockOfferings();

    }
}
