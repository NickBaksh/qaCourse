package clean.code.final_tasks.task_2;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class VideoService {
    private final Map<String, Mp4VideoFile> storage = new ConcurrentHashMap<>();
    private final Map<String, VideoAdapter> adapters = new ConcurrentHashMap<>();


    public VideoService() {
        adapters.put("avi", new AviVideoAdapter());
        adapters.put("mov", new MovVideoAdapter());
        adapters.put("wmv", new WmvVideoAdapter());
    }

    public String uploadVideo(String videoPath) {
        String format = VideoFormatResolver.returnFormat(videoPath);
        VideoAdapter adapter = adapters.get(format);
        if (adapter == null) {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }
        VideoFile uploadFile = new VideoFile(videoPath, format);
        byte[] convertedFile = adapter.convert(uploadFile);
        String id = UUID.randomUUID().toString();
        Mp4VideoFile mp4 = new Mp4VideoFile(id, convertedFile, format);
        storage.put(id, mp4);
        return id;
    };

    public Stream streamVideo(String id) {
        Mp4VideoFile streamingFile = storage.get(id);
        if (streamingFile == null) {
            throw new IllegalArgumentException("Error: 404. This file is not presented. ID: " + id);
        }
        return new Stream(streamingFile.getContent(), id);
    }
}
