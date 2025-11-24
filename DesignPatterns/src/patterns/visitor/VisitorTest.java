package patterns.visitor;

public class VisitorTest {
    static void main() {
        TaxVisitor taxCalc  = new TaxVisitor();
        TaxHolidayVisitor holidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(1.50);
        Liquor vodka = new Liquor(11.99);
        Tobacco tobacco = new Tobacco(15.99);
        System.out.println(milk.accept(taxCalc) + " " + vodka.accept(taxCalc) + " " + tobacco.accept(taxCalc));

    }
}
