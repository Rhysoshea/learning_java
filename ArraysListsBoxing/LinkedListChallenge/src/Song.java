public class Song {
    private String title;
    private double duration;
    private String albumTitle;


    private Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public boolean hasAlbum(){
        if(this.albumTitle != null){
            return true;
        }
        return false;
    }

    public void addAlbumTitle(String title){
        this.albumTitle = title;
    }

    public static Song createSong(String title, double duration){
        return new Song(title, duration);
    }


}
