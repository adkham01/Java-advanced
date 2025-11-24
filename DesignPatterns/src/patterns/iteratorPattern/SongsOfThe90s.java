package patterns.iteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements Song{
    private Hashtable<Integer, SongInfo> songs;
    private int hashKey;

    public SongsOfThe90s() {
        hashKey = 0;
        songs = new Hashtable<>();
        addSong("The Best Day Of My Life", "The Beatles", 1990);
        addSong("Make Me Smile", "The Beatles", 1991);
        addSong("Let It Be", "The Beatles", 1995);
        addSong("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 1997);
        addSong("Revolver", "The Beatles", 1998);
        addSong("Help", "The Beatles", 1999);
        addSong("Hey Jude", "The Beatles", 2001);
        addSong("The Marshall Mathers Band", "The Beatles", 2002);
        addSong("Born In the USA", "The Beatles", 2003);
        addSong("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 2004);
        addSong("White Room", "The Beatles", 2005);
        addSong("The Best Day Of My Life", "The Beatles", 2006);
        addSong("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 2007);

    }

    @Override
    public void addSong(String songName, String bandName, int releaseYear) {
        songs.put(hashKey, new SongInfo(songName, bandName, releaseYear));
        hashKey++;
    }
    public Hashtable<Integer, SongInfo> getSongs() {
        return songs;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return songs.values().iterator();
    }
}
