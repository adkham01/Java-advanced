package patterns.factory;

public class UFOEnemyShip extends EnemyShip{
    private String idCode = "100";
    private String getPrivate(){
        return "Private how did you get here";
    }
    private String getOtherPrivate(int thisInt, String thatString){
        return "Private how did you get here" + thisInt + " " + thatString;
    }



    public UFOEnemyShip(int number, String randString) {

        System.out.println("You sent: " + number + " " + randString);
    }

    public UFOEnemyShip() {
        setName("UEFO Enemy Ship");
        setAmtDamage(20.0);
        System.out.println("No args constructor");
    }
    @Override
    public String toString() {
        return "UFO Enemy Ship";
    }
}
