package patterns.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
