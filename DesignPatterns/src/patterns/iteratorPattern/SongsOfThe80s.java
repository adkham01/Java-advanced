package patterns.iteratorPattern;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements Song{
    private SongInfo[] songs;
    private int index;

    public SongsOfThe80s() {
        index = 0;
        songs = new SongInfo[5];
        addSong("The Best Day Of My Life", "The Beatles", 1980);
        addSong("Revolver", "The Beatles", 1981);
        addSong("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 1982);
        addSong("Can't Get Enough", "The Beatles", 1983);
        addSong("Let It Be", "The Beatles", 1985);

    }
    @Override
    public void addSong(String songName, String bandName, int releaseYear) {
        songs[index] = new SongInfo(songName, bandName, releaseYear);
        index++;
    }
    public SongInfo[] getSongs() {
        return songs;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return Arrays.stream(songs).iterator();
    }
}
