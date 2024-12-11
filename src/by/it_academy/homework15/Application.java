package by.it_academy.homework15;

public class Application {
    private Send [] protocols;

    public Application() {
    protocols = new Send[3];
    }

    public void setProtocol(int slot, Send protocol) {
        protocols[slot] = protocol;
    }

    public void sendMessage(int slot) {
        if (protocols[slot] != null) {
            protocols[slot].execute();
        }
    }



}
