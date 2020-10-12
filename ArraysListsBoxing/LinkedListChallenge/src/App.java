import java.util.Scanner;
import java.util.ListIterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        Album album = Album.createAlbum("XandY");
        Song songOne = Song.createSong("Yellow", 4.25);
        Song songTwo = Song.createSong("Scientist", 4.0);
        Song songThree = Song.createSong("VivaLaVida", 3.2);

        album.addSong(songOne);
        album.addSong(songTwo);

        album.getSongs();

        Playlist playlist = Playlist.createPlaylist("Coldplay");

        playlist.addSong(songOne);
        playlist.addSong(songTwo);
        playlist.addSong(songThree);

        album.addSong(songThree);
        playlist.addSong(songThree);
        playlist.listSongs();

        playlist.removeSong("Magic");
        playlist.removeSong("Yellow");

        playPlaylist(playlist.getSongs());


    }

    private static void playPlaylist(LinkedList playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.isEmpty()){
            System.out.println("No songs in playlist");
            return;
        } else{
            printMenu();
            System.out.println("Now playing " + listIterator.next().getTitle());
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Stopping");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached end of playlist");
                    }
                    break;
                case 2:
                    if (goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else{
                        System.out.println("Reached start of playlist");
                    }
                    break;
                case 3:
                    System.out.println("Replaying song");
                    listIterator.previous();
                    System.out.println("Now playing " + listIterator.next().getTitle());
                    break;

                case 4:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println(
                "0 - to quit\n" + 
                "1 - skip song\n" + 
                "2 - play previous song\n" + 
                "3 - replay current song\n" +
                "4 - print menu\n");
    }
}
