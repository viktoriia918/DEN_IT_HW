package java_hw_6.task_3;

public class Video extends Media {
    private String resolution;
    public Video(String title, int duration, String resolution) {
    super(title, duration);
    this.resolution = resolution;
    }
    @Override
    public void play() {
    System.out.println("Play video" + title + " in resolution" + resolution);
    }
}
