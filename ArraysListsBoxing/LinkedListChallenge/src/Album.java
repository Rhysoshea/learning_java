import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;
    private String name;

    private Album(String name){
        this.songs = new ArrayList<Song>();
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }

    public String getName() {
        return this.name;
    }

    public static Album createAlbum(String name){
        return new Album(name);
    }

    public void addSong(String title, double duration){
        Song newSong = Song.createSong(title, duration);
        newSong.addAlbumTitle(this.name);
        songs.add(newSong);
    }

    public void addSong(Song song) {
        song.addAlbumTitle(this.name);
        songs.add(song);
    }


}
