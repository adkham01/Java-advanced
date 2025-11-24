package patterns.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements Song{
    private ArrayList<SongInfo> songs;
    public SongsOfThe70s() {
        songs = new ArrayList<>();
        addSong("Imagine", "John Lennon", 1970);
        addSong("Blue Banisters", "The Beatles", 1970);
        addSong("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 1971);
        addSong("Revolver", "The Beatles", 1972);
        addSong("Hey Jude", "The Beatles", 1973);
        addSong("The Millionaire Next Door", "The Beatles", 1974);
        addSong("Let It Be", "The Beatles", 1975);
        addSong("White Room", "The Beatles", 1976);
        addSong("The Best Day Of My Life", "The Beatles", 1977);
        addSong("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 1977);
        addSong("Help", "The Beatles", 1978);
        addSong("Hey Jude", "The Beatles", 1979);
        addSong("The Marshall Mathers Band", "The Beatles", 1980);
    }

    @Override
    public void addSong(String songName, String bandName, int releaseYear) {
        songs.add(new SongInfo(songName, bandName, releaseYear));
    }

    public ArrayList<SongInfo> getSongs() {
        return songs;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return songs.iterator();
    }
}
