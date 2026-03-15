package clean.code.final_tasks.task_2;

public class Mp4VideoFile {
    private final String id;
    private final byte[] content;
    private final String sourceFileFormat;

    public Mp4VideoFile(String id, byte[] content, String sourceFileFormat) {
        this.id = id;
        this.content = content;
        this.sourceFileFormat = sourceFileFormat;
    }

    public String getId() {
        return id;
    }

    public byte[] getContent() {
        return content;
    }

    public String getSourceFileFormat() {
        return sourceFileFormat;
    }
}
