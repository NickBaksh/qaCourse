package clean.code.final_tasks.task_2;

public class Stream {
    private String videoId;
    private byte[] data;

    public Stream(byte[] data, String videoId) {
        this.data = data;
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }

    public byte[] getData() {
        return data;
    }
}
