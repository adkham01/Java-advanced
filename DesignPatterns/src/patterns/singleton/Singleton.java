package patterns.singleton;

import java.util.*;

public class Singleton {
    private static Singleton instance = null;
    private final String[] scrambleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "b", "b", "b", "b", "b", "b", "b",
            "c", "c", "c", "c", "c", "c", "c", "c", "c",
            "d", "d", "d", "d", "d", "d", "d", "d", "d",
            "m", "n", "m", "n", "m", "n", "m", "n", "m", "n", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    private final LinkedList<String> scrambledLetters = new LinkedList<>(Arrays.asList(scrambleLetters));
    static boolean firstThread = true;

    private Singleton() {}
    public static Singleton getInstance() throws InterruptedException {
        if (instance == null) {
           synchronized (Singleton.class){
               instance = new Singleton();
           }
            Collections.shuffle(instance.scrambledLetters);

            if(firstThread){
                firstThread = false;
                System.out.println(Thread.currentThread().getName() + " is the first thread");
                Thread.sleep(1000);
            }
        }
        return instance;
    }

    public LinkedList<String> getScrambledLettersList() {
        return instance.scrambledLetters;
    }

    public LinkedList<String> getTiels(int howMany) {
        LinkedList<String> tiels = new LinkedList<>();
        for(int i = 0; i < howMany; i++){
            tiels.add(instance.scrambledLetters.removeFirst());
        }
        return tiels;
    }
}
