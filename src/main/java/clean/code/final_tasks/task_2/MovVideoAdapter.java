package clean.code.final_tasks.task_2;

public class MovVideoAdapter implements VideoAdapter {
    final MovConverter movConverter;

    public MovVideoAdapter() {
        this.movConverter = new MovConverter();
    }

    @Override
    public byte[] convert(VideoFile file) {
        return movConverter.convertFile(file.getFilePath());
    }
}
