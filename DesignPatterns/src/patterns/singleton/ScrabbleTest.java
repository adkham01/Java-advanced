package patterns.singleton;

import java.util.LinkedList;

public class ScrabbleTest {
    static void main() throws Exception {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Instance 1 ID: " + System.identityHashCode(singleton));

        System.out.println(singleton.getScrambledLettersList());
        LinkedList<String> playerOneTiels = singleton.getTiels(7);

        System.out.println("Player 1: " + playerOneTiels);

        System.out.println(singleton.getScrambledLettersList());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(singleton2));

        LinkedList<String> playerTwoTiels = singleton.getTiels(7);

        System.out.println("Player 2: " + playerTwoTiels);


    }
}
