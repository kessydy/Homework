package by.it_academy.homework15;

import java.time.LocalDateTime;

//Разработать приложение для обмена сообщениями между пользователями.
//Каждое сообщение должно иметь отправителя, получателя, время отправления и тело сообщения
//Приложение должно поддерживать несколько протоколов обмена сообщениями, таких как электронная почта, SMS
//На основе данного сценария и требований выберите один из следующих шаблонов проектирования:
// Singleton, Builder, Adapter или Command.
public class Message {
    private String receiver;
    private String sender;
    private LocalDateTime time;
    private String message;

    public Message(String receiver, String sender, String message) {
        this.receiver = receiver;
        this.sender = sender;
        this.time = LocalDateTime.now();
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public void sentBySMS(Message message) {
        System.out.printf("The sms \"%s\" sent from %s to %s at %s", message.getMessage(), message.getSender(), message.getReceiver(), message.getTime());
        System.out.println();
    }

    public void sentByEmail(Message message) {
        System.out.printf("The email \"%s\" sent from %s to %s at %s", message.getMessage(), message.getSender(), message.getReceiver(), message.getTime());
        System.out.println();
    }
}
