package ObjectsOnAList;

public class PlaylistMain {
    public static void main(String[] args) {
        Playlist list = new Playlist();
        list.addSong("Sorateiden kuningas");
        list.addSong("Teuvo, maanteiden kuningas");
        list.printSongs();
    }
}
