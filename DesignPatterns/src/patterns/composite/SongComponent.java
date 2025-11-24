package patterns.composite;

public abstract class SongComponent {
    public void add(SongComponent component){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void remove(SongComponent component){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public SongComponent getComponent(int index){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getBandName(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getReleaseYear(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
