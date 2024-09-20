public class SMSAdapter implements Notification {
    private SMSProvider smsProvider;
    private String phoneNumber;

    public SMSAdapter(SMSProvider smsProvider, String phoneNumber) {
        this.smsProvider = smsProvider;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        smsProvider.sendTextMessage(phoneNumber, message);
    }
}
