package ObjectsAndReferences;

public class Song {
    private String title;
    private String singer;
    private int duration;
    public Song(String title, String singer, int duration) {
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) compared;

        return this.title.equals(comparedSong.title) && this.singer.equals(comparedSong.singer) && this.duration == comparedSong.duration;
    }
    @Override
    public String toString() {
        return String.format("%s sings the song %s, that is %d long.", singer, title, duration);
    }
}
