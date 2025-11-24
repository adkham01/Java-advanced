package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator{
    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSaleOffers = new ArrayList<>();
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;
        for(StockOffer offer : stockBuyOffers){
            if(offer.getStockSymbol().equals(stock) && offer.getStockShares() == shares){
                System.out.println(shares + " shares of " + stock + " bought by " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if(stockSold){
                break;
            }
        }
        if(!stockSold){
            System.out.println(shares + " shares of " + stock + "added to inventory");
            StockOffer newOffer = new StockOffer(shares, stock, colleagueCode);
            stockSaleOffers.add(newOffer);
        }
    }
    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;
        for(StockOffer offer : stockSaleOffers){
            if(offer.getStockSymbol().equals(stock) && offer.getStockShares() == shares){
                System.out.println(shares + " shares of " + stock + " sold by " + offer.getColleagueCode());
                stockSaleOffers.remove(offer);
                stockBought = true;
            }
            if(stockBought){
                break;
            }
        }
        if(!stockBought){
            System.out.println(shares + " shares of " + stock + " added to inventory");
            StockOffer newOffer = new StockOffer(shares, stock, colleagueCode);
            stockBuyOffers.add(newOffer);
        }
    }
    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setColleagueCode(colleagueCodes++);
    }

    public void getStockOfferings(){
        System.out.println("\nStock for sale");
        for(StockOffer offer : stockBuyOffers){
            System.out.println(offer.getStockShares() + " shares of " + offer.getStockSymbol());
        }

        System.out.println("\nStock for purchase");
        for(StockOffer offer : stockSaleOffers){
            System.out.println(offer.getStockShares() + " shares of " + offer.getStockSymbol());
        }
    }
}
