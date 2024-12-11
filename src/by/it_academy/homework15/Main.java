package by.it_academy.homework15;

//Разработать приложение для обмена сообщениями между пользователями.
//Каждое сообщение должно иметь отправителя, получателя, время отправления и тело сообщения
//Приложение должно поддерживать несколько протоколов обмена сообщениями, таких как электронная почта, SMS
//На основе данного сценария и требований выберите один из следующих шаблонов проектирования:
// Singleton, Builder, Adapter или Command.
public class Main {
    public static void main(String[] args) {

        Message message1 = new Message("Ann", "Bob", "Hello");
        Message message2 = new Message("Mike", "Jane", "Let's go");

        Send sendSMS = new SendSMS(message1);
        Send sendEmail = new SendEmail(message2);

        Application application = new Application();
        application.setProtocol(0, sendSMS);
        application.setProtocol(1, sendEmail);

        application.sendMessage(0);
        application.sendMessage(1);

    }
}
