/**
 * Created by ruplaga on 7/29/2017.
 */
public class MessageSenderService {

    public static void sendMessage(String string, MessageSenderInterface messageSender) {
        messageSender.send(string);
    }

}
