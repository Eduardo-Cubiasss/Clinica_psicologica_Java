
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
ipackage ux;mport com.twilio.type.PhoneNumber;
package ux;
import java.net.URI;
import java.math.BigDecimal;
import ux.DatoRandom;

/**
 *
 * @author 50369
 */


public class RecMessage {

    public static final String ACCOUNT_SID = "ACa9d7e2e2781f6317f9f5fd560cc7445d";
    public static final String AUTH_TOKEN = "[AuthToken]";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(Numerolol),
                new com.twilio.type.PhoneNumber("+12345953386"),
                "Bienvenido a la recuperación de mensaje por numero, su codigo de recuperacion es:  " + DatoRandom.generateRandomData(5)
                        .create();

        System.out.println(message.getSid());
    }

}
