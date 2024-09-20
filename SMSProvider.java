public class SMSProvider {
    public void sendTextMessage(String phoneNumber, String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
