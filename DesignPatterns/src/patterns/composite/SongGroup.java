package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent{
    private List<SongComponent> songs;
    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        songs = new ArrayList<>();
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public List<SongComponent> getSongs() {
        return songs;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent song) {
        songs.add(song);
    }

    @Override
    public void remove(SongComponent song) {
        songs.remove(song);
    }

    @Override
    public SongComponent getComponent(int index) {
        return songs.get(index);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName() + " - " + getGroupDescription() + "\n");
        songs.forEach(SongComponent::displaySongInfo);
    }
}
