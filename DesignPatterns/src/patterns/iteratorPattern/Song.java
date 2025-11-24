package patterns.iteratorPattern;


import java.util.Iterator;

public interface Song {
    void addSong(String songName, String bandName, int releaseYear);
    Iterator<SongInfo> createIterator();
}
