import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Playlist {
    private LinkedList<Song> songs;
    private String name;


    private Playlist(String name) {
        this.songs = new LinkedList<Song>();
        this.name = name;
    }

    public LinkedList<Song> getSongs() {
        return this.songs;
    }

    public String getName(){
        return this.name;
    }

    public static Playlist createPlaylist(String name){
        return new Playlist(name);
    }

    public void addSong(Song song){
        if (song.hasAlbum()){
            songs.add(song);
        } else {
            System.out.println("Song has no album");
        }
    }

    public void listSongs(){
        ListIterator<Song> listIterator = songs.listIterator();

        if(songs.isEmpty()){
            System.out.println("No songs in playlist");
        } else {
            int i=1;
            while (listIterator.hasNext()){
                System.out.println(i + ". " + listIterator.next().getTitle());
                i++;
            }
        }
    }


    public void removeSong(String title){
        Iterator<Song> iterator = songs.iterator();
        if (songs.isEmpty()) {
            System.out.println("No songs in playlist");
        } else {
            while (iterator.hasNext()) {
                if (iterator.next().getTitle().equals(title)){
                    iterator.remove();
                    System.out.println(title + " removed from playlist");
                    break;
                };
            }
        }
    }


}
