package patterns.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    private DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with tax");
        double tax = liquorItem.getPrice() * 0.18;
        double total = liquorItem.getPrice() + tax;
        return Double.parseDouble(df.format(total));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco item: Price with tax");
        double tax = tobacco.getPrice() * 0.32;
        double total = tobacco.getPrice() + tax;
        return Double.parseDouble(df.format(total));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity item: Price with tax"); // Fixed the message too
        double tax = necessity.getPrice() * 0.44;
        double total = necessity.getPrice() + tax;
        return Double.parseDouble(df.format(total));
    }
}