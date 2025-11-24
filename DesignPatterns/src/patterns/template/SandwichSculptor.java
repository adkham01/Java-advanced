package patterns.template;

public class SandwichSculptor {
    static void main() {
        Hoagie customer12 = new ItalianHoagie();
        customer12.makeSandwich();
        System.out.println();

        Hoagie customer13 = new VeggieHoagie();
        customer13.makeSandwich();
    }
}
