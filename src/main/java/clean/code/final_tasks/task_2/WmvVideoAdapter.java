package clean.code.final_tasks.task_2;

public class WmvVideoAdapter implements VideoAdapter {
    WmvConverter wmvConverter;

    public WmvVideoAdapter() {
        this.wmvConverter = new WmvConverter();
    }

    @Override
    public byte[] convert(VideoFile file) {
        return wmvConverter.convertFile(file.getFilePath());
    }
}
