package by.it_academy.homework15;

public class SendSMS implements Send {
    private Message message;


    public SendSMS(Message message) {
        this.message = message;
    }

    @Override
    public void execute() {
        message.sentBySMS(message);
    }
}
