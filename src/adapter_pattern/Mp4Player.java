package adapter_pattern;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        System.out.println("Play mp4 file: "+ fileName);
    }
}
