package leonid_ivanov.runner;

import leonid_ivanov.payment_card.PaymentCard;
import leonid_ivanov.payment_card.PaymentCardGenerator;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercard;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardElectronic;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * The application's main class
 *
 * @author Leonid_Ivanov
 */
public class Runner {
    private static final Logger log = Logger.getLogger(Runner.class);

    public static void main(String[] args) {

        log.info("Info message");
        Runner applicationRunnner = new Runner();
        applicationRunnner.startApplication(new String[] {"visa_classic", "10"});
    }

    public void startApplication(String[] args) {
        PaymentCardGenerator paymentCardGenerator = null;
        try {
            paymentCardGenerator = new PaymentCardGenerator(args[0],
                    Integer.parseInt(args[1]));
        } catch (NumberFormatException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Set<PaymentCard> set = paymentCardGenerator.getPaymentCardSet();
        for (PaymentCard paymentCard : set) {
            System.out.println(paymentCard.toString());
        }
    }

}
