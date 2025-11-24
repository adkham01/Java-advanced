package patterns.visitor;

public interface Visitor {
    double visit(Liquor liquorItem);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);
}
