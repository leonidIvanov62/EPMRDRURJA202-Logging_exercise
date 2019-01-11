package leonid_ivanov_test.payment_card.mastercard;

import leonid_ivanov.payment_card.mastercard.PaymentCardMastercard;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardElectronic;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardMaestro;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardMasterCard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PaymentCardMastercardTest {

    private PaymentCardMastercard paymentCardMastercard;

    public PaymentCardMastercardTest(PaymentCardMastercard paymentCardMastercard) {
        this.paymentCardMastercard = paymentCardMastercard;
    }

    @Parameterized.Parameters(name = "{index}: PaymentCard: {0}")
    public static Iterable<Object> data() {
        PaymentCardMastercard[] dataArray = {
                new PaymentCardMastercardElectronic(),
                new PaymentCardMastercardMaestro(),
                new PaymentCardMastercardMasterCard()};
        return Arrays.asList(dataArray);
    }


    /**
     * Test payment card payment system type
     */
    @Test
    public void testPaymentSystemMasterCardElectronicCard() {
        final String mastercardPaymentType;
        mastercardPaymentType = "Mastercard";
        assertEquals(mastercardPaymentType,
                paymentCardMastercard.getPaymentSystem());
    }

    @Test
    public void testMasterCardIIN() {
        assertTrue(checkTwoNumberIIN() || checkFourNumberIIN());
    }

    private boolean checkFourNumberIIN() {
        int iin = getIIN(4);
        return (iin >= PaymentCardMastercard.IIN_2221 && iin <= PaymentCardMastercard.IIN_2720);
    }

    private boolean checkTwoNumberIIN() {
        int iin = getIIN(2);
        return (iin >= PaymentCardMastercard.IIN_51 && iin <= PaymentCardMastercard.IIN_55);
    }

    private int getIIN(int iinLength) {
        String iinNumber = "";
        for (int i = 0; i < iinLength; i++) {
            iinNumber += paymentCardMastercard.getPaymentCardNumber()[i];
        }
        return Integer.parseInt(iinNumber);
    }
}
