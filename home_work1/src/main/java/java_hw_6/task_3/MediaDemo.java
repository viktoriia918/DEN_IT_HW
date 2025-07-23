package java_hw_6.task_3;

public class MediaDemo {
    public static void main(String[] args) {
    Media genericMedia = new Media("Generic Media", 10);
    Music music = new Music("Imagine", 4, "John Lennon");
    Video video = new Video("Nature Documentary", 50, "1920x1080");
    Media[] playlist = { genericMedia, music, video };
    for (Media media : playlist) {
    media.play();
    }
    }
}