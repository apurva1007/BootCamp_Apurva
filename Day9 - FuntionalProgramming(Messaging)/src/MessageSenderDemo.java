/**
 * Created by ruplaga on 7/29/2017.
 */
public class MessageSenderDemo {

    public static void main(String[] args) {
        MessageSenderService.sendMessage("WhatsApp",(String string) -> {
            System.out.printf("Type of messaging : %s", string);
        });
    }

}
