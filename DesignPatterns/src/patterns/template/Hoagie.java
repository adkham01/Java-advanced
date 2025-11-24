package patterns.template;

public abstract class Hoagie {
    public final void makeSandwich() {
        System.out.println("Making sandwich");
        cutBun();
        if (wantMeat()) {
            addMeat();
        }
        if (wantCheese()) {
            addCheese();
        }
        if (wantVeggies()) {
            addVeggies();
        }
        wrapTheHoagie();
    }

    public void cutBun() {
        System.out.println("Cutting bun");
    }

    public abstract void addMeat();

    public abstract void addCheese();

    public abstract void addVeggies();

    public abstract void wrapTheHoagie();

    public abstract boolean wantMeat();

    public abstract boolean wantCheese();

    public abstract boolean wantVeggies();
}
