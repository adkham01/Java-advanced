package patterns.factory;

import java.util.Scanner;

public class EnemyShipTesting {

    static void main() {
        boolean keepGoing;
        do {
            EnemyShipFactory factory = new EnemyShipFactory();

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter ship type: U, R, B ");
            String shipType = userInput.nextLine();

            play(factory.makeEnemyShip(shipType));

            System.out.println("\nDo you want to continue? Y / N");
            keepGoing = userInput.nextLine().equalsIgnoreCase("Y");

        }
        while(keepGoing);
    }

    private static void play(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }


}
