package adapter_pattern;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter() {
        advancedMediaPlayer = new Mp4Player();
    }

    @Override
    public void playMedia(String fileName) {
        advancedMediaPlayer.playMP4(fileName);
    }
}
