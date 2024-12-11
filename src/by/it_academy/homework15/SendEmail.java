package by.it_academy.homework15;

public class SendEmail implements Send {
    private Message message;


    public SendEmail(Message message) {
        this.message = message;

    }

    @Override
    public void execute() {
        message.sentByEmail(message);
    }
}


