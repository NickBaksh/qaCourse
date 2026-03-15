package clean.code.final_tasks.task_2;

public class Main {
    public static void main(String[] args) {

        VideoService videoService = new VideoService();

        //Конвертируем видео в формате avi в mp4 и загружаем в библиотеку
        String aviVideoPath = "path/to/example.avi";
        String aviVideoId = videoService.uploadVideo(aviVideoPath);

        //Запускаем стрим видео (исходный файл avi)
        Stream aviStream = videoService.streamVideo(aviVideoId);
        System.out.println("Streaming video in MP4 format, video Data: " + aviStream.getData() + " || VideoID: " + aviStream.getVideoId());

        System.out.println();

        //Конвертируем видео mov в mp4 и загружаем в библиотеку
        String movVideoPath = "path/video/folder1/video.mov";
        String movVideoId = videoService.uploadVideo(movVideoPath);

        //Запускаем стрим видео (исходник видео в mov)
        Stream movStream = videoService.streamVideo(movVideoId);
        System.out.println("Streaming video in MP4 format, video Data: " + movStream.getData() + " || " + movStream.getVideoId());


        System.out.println();

        //Пробуем загрузить видео в формате flv, но такой формат не поддерживается программой
        String flvVideoPath = "path/video/folder1/video.flv";

        //Падает исключение IllegalArgumentException: Unsupported format: flv
//        String flvVideoId = videoService.uploadVideo(flvVideoPath);
//
//        Stream flvStream = videoService.streamVideo(flvVideoId);
//        System.out.println("Streaming video in MP4 format, video Data: " + flvStream.getData() + " || " + flvStream.getVideoId());
    }
}
