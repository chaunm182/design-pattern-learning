package adapter_pattern;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayerImpl();
        // play mp3 file
        String fileName = "a.mp3";
        player.playMedia(fileName);

        fileName = "b.mp4";
        player.playMedia(fileName);

        fileName = "c.avi";
        player.playMedia(fileName);

    }
}
