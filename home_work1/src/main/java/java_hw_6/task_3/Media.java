package java_hw_6.task_3;

    class Media {
    protected String title;
    protected int duration;

    public Media(String title, int duration) {
    this.title = title;
    this.duration = duration;
        }
    public void play() {
    System.out.println("Play multimedia");
        }
    }
    class Music extends Media {
    private String artist;
    public Music(String title, int duration, String artist) {
    super(title, duration);
    this.artist = artist;
    }
    @Override
    public void play() {
    System.out.println("Play music " + artist + ": " + title);
        }
    }
    class Video extends Media {
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