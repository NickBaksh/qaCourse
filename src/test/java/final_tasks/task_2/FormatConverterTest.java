package final_tasks.task_2;

import clean.code.final_tasks.task_2.VideoFormatResolver;
import clean.code.final_tasks.task_2.VideoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FormatConverterTest {
    private VideoService videoService;

    @BeforeEach
    void setUp() {
        videoService = new VideoService();
    }

    @ParameterizedTest
    @ValueSource(strings = {"/video.avi", "/video.mov", "/video.wmv"})
    @DisplayName("Должен вернуть true при загрузке видео в форматах avi, mov, wmv в хранилище данных")
    public void shouldUploadAviVideo(String fileName) {
        String id = videoService.uploadVideo(fileName);

        Assertions.assertNotNull(id);
    }

    @Test
    @DisplayName("Должен вернуть IllegalArgumentException если в url файла будет отсутствовать расширение")
    public void shouldThrowIllegalArgumentExceptionIfFileHasNoException() {
        String filePath = "/video";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {videoService.uploadVideo(filePath);}, "File has no extension: ");
    }

    @Test
    @DisplayName("Должен вернуть True если формат видео avi")
    public void shouldResolveVideoFormat() {
        String format = VideoFormatResolver.returnFormat("video.avi");

        Assertions.assertEquals("avi", format);
    }

    @Test
    @DisplayName("Для формата который не поддерживается, должен выбросить исключение " +
            "(IllegalArgumentException: Unsupported format: {format})")
    public void shouldThrowIllegalArgumentException() {
        VideoService service = new VideoService();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {service.uploadVideo("video.flv");},
                "Unsupported format: flv");
    }
}
