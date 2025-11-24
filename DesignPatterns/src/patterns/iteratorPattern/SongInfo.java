package patterns.iteratorPattern;

public class SongInfo {
    private String songName;
    private String bandName;
    private int releaseYear;

    public SongInfo(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }
    public String getSongName() {
        return songName;
    }
    public String getBandName() {
        return bandName;
    }
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "SongInfo{" +
                "songName='" + songName + '\'' +
                ", bandName='" + bandName + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
