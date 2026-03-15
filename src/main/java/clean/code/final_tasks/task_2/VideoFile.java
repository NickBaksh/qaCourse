package clean.code.final_tasks.task_2;

public class VideoFile {
    private final String filePath;
    private final String format;

    public VideoFile(String filePath, String format) {
        this.filePath = filePath;
        this.format = format;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFormat() {
        return format;
    }
}
