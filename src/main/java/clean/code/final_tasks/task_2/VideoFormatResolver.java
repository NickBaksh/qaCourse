package clean.code.final_tasks.task_2;

public class VideoFormatResolver {

    public static String returnFormat(String filePath) {
        int dotIndex = filePath.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filePath.length() - 1) {
            throw new IllegalArgumentException("File has no extension: " + filePath);
        }
        return filePath.substring(dotIndex + 1).toLowerCase();
    }
}
