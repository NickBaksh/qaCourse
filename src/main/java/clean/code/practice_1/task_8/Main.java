package clean.code.practice_1.task_8;

public class Main {
    static void main(String[] args) {
        EmailSender emailSender = new EmailSender();

        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.sendNotification("Hello!");
    }
}
