package patterns.visitor;

public class TaxHolidayVisitor implements Visitor {

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with tax");
        return Math.round((liquorItem.getPrice() * 1.10) * 100.0) / 100.0;
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco item: Price with tax");
        return Math.round((tobacco.getPrice() * 1.22) * 100.0) / 100.0;
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity item: Price with tax"); // Fixed the message
        return Math.round((necessity.getPrice() * 1.34) * 100.0) / 100.0;
    }
}