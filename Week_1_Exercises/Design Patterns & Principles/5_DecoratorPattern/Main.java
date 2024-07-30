public class Main {
    public static void main(String[] args) {
        // Base notifier
        Notifier notifier = new EmailNotifier();

        // Adding SMS and Slack notifications dynamically
        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Sending notification through all channels
        slackNotifier.send("This is a notification message.");
    }
}
