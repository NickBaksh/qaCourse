package clean.code.final_tasks.task_2;

public class WmvConverter implements Converter {
    @Override
    public byte[] convertFile(String path) {
        System.out.println("Converting WMV to MP4 from path: " + path);
        //заглушка для демонстрации преобразования файла в MP4
        return new byte[0];
    }
}
