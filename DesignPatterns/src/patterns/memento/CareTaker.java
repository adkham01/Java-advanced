package patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> savedArticles;

    public CareTaker() {
        savedArticles = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        savedArticles.add(memento);
    }

    public List<Memento> getSavedArticles() {
        return savedArticles;
    }

    public Memento getMemento(int currentArticle) {
        return savedArticles.get(currentArticle);
    }
}
