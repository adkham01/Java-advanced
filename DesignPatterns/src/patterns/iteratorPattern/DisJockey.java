package patterns.iteratorPattern;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

public class DisJockey {
    private SongsOfThe70s songsOfThe70s;
    private SongsOfThe80s songsOfThe80s;
    private SongsOfThe90s songsOfThe90s;

    public DisJockey(SongsOfThe70s songsOfThe70s, SongsOfThe80s songsOfThe80s, SongsOfThe90s songsOfThe90s) {
        this.songsOfThe70s = songsOfThe70s;
        this.songsOfThe80s = songsOfThe80s;
        this.songsOfThe90s = songsOfThe90s;
    }

    public void getAllSongs(){
        System.out.println("Songs of the 70's:");
        for (SongInfo songInfo : songsOfThe70s.getSongs()) {
            System.out.println(songInfo);
        }

        System.out.println("\n\nSongs of the 80's:");
        for (SongInfo songInfo : songsOfThe80s.getSongs()) {
            System.out.println(songInfo);
        }

        System.out.println("\n\nSongs of the 90's:");
        for(Enumeration<Integer> e = songsOfThe90s.getSongs().keys(); e.hasMoreElements();){
            SongInfo songInfo = songsOfThe90s.getSongs().get(e.nextElement());
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getReleaseYear());
        }
    }
    public void getAllSongsIterator(){
        Iterator<SongInfo> it70s = songsOfThe70s.createIterator();
        Iterator<SongInfo> it80s = songsOfThe80s.createIterator();
        Iterator<SongInfo> it90s = songsOfThe90s.createIterator();
        while(it70s.hasNext()){
            System.out.println(it70s.next());
        }
        while(it80s.hasNext()){
            System.out.println(it80s.next());
        }
        while(it90s.hasNext()){
            System.out.println(it90s.next());
        }
    }

    public void getAllSongsStream(){
        songsOfThe70s.getSongs().forEach(System.out::println);
        Arrays.stream(songsOfThe80s.getSongs()).forEach(System.out::println);
        songsOfThe90s.getSongs().forEach((k,v) -> System.out.println(v.getSongName()));
    }



}
