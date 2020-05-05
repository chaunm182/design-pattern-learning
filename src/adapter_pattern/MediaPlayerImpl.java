package adapter_pattern;

public class MediaPlayerImpl implements MediaPlayer {
    @Override
    public void playMedia(String fileName) {
        if (fileName.endsWith(".mp3")){
            System.out.println("play mp3 file: "+fileName);
        }
        else if (fileName.endsWith(".mp4")){
            MediaAdapter adapter = new MediaAdapter();
            adapter.playMedia(fileName);
        }
        else{
            System.out.println("file is not supported");
        }
    }
}
