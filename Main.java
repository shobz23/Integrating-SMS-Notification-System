public class Main {
    public static void main(String[] args) {
        // Use the SMSAdapter to send an SMS notification
        SMSProvider smsProvider = new SMSProvider();
        Notification notification = new SMSAdapter(smsProvider, "123-456-7890");

        notification.sendNotification("Your appointment is confirmed.");  // Output: SMS sent to 123-456-7890: Your appointment is confirmed.
    }
}
