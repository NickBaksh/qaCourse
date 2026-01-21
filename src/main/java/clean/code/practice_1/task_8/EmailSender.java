package clean.code.practice_1.task_8;

class EmailSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}