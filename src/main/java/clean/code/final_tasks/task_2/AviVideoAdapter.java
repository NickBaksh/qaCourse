package clean.code.final_tasks.task_2;

public class AviVideoAdapter implements VideoAdapter {
    final AviConverter aviConverter;

    public AviVideoAdapter() {
        this.aviConverter = new AviConverter();
    }

    @Override
    public byte[] convert(VideoFile file) {
        return aviConverter.convertFile(file.getFilePath());
    }
}
