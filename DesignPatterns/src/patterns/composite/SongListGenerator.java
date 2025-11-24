package patterns.composite;

public class SongListGenerator {
    static void main() {
        SongComponent industrialMusic = new SongGroup("Industrial", "Industrial music");
        SongComponent rockMusic = new SongGroup("Rock", "Rock music");
        SongComponent popMusic = new SongGroup("Pop", "Pop music");
        SongComponent classicalMusic = new SongGroup("Classical", "Classical music");

        SongComponent everySong = new SongGroup("Songs List", "All songs available");
        everySong.add(classicalMusic);
        industrialMusic.add(new Song("Head like Hole", "NiN", 1990));
        industrialMusic.add(new Song("Tetris", "Doctor D", 2021));

        rockMusic.add(new Song("The Best of Me", "Metallica", 1980));
        rockMusic.add(new Song("Head Hunter", "NiN", 1990));

        popMusic.add(new Song("Knife Party", "Minor", 2012));
        popMusic.add(new Song("Loose Yourself", "Pop Music", 1999));

        classicalMusic.add(new Song("Oy yuzli", "Maqom", 2025));
        classicalMusic.add(new Song("Gul yuzli", "Maqom", 2025));
        everySong.add(industrialMusic);
        everySong.add(rockMusic);
        everySong.add(popMusic);

        DiscJockey dj = new DiscJockey(everySong);
        dj.getSongList();
    }
}
