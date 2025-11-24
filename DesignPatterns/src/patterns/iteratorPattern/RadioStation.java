package patterns.iteratorPattern;

public class RadioStation {
    static void main() {
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();

        DisJockey disJockey = new DisJockey(songs70s, songs80s, songs90s);
        disJockey.getAllSongs();
        disJockey.getAllSongsIterator();
        disJockey.getAllSongsStream();
    }

}
