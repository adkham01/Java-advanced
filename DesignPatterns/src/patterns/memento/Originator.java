package patterns.memento;

public class Originator {
    private String article;

    public void setArticle(String article) {
        System.out.println("From Originator: Current version of Article is: " + article + "\n");
        this.article = article;
    }

    public Memento storeInMemento(){
        System.out.println("From Originator: Saving to Memento");
        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento){
        System.out.println("From Originator: Previous version of Article is: " + this.article + "\n");
        return this.article = memento.getArticle();
    }



}
