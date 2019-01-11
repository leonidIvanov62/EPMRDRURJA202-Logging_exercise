package leonid_ivanov_test.payment_card.mir;

import leonid_ivanov.payment_card.mir.PaymentCardMir;
import leonid_ivanov.payment_card.mir.PaymentCardMirClassic;
import leonid_ivanov.payment_card.mir.PaymentCardMirDebit;
import leonid_ivanov.payment_card.mir.PaymentCardMirPremium;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PaymentCardMirTest {
    private PaymentCardMir paymentCardMastercard;

    public PaymentCardMirTest(PaymentCardMir paymentCardMastercard) {
        this.paymentCardMastercard = paymentCardMastercard;
    }

    @Parameterized.Parameters(name = "{index}: PaymentCard: {0}")
    public static Iterable<Object> data() {
        PaymentCardMir[] dataArray = {
                new PaymentCardMirClassic(),
                new PaymentCardMirDebit(),
                new PaymentCardMirPremium()};
        return Arrays.asList(dataArray);
    }


    /**
     * Test payment card payment system type
     */
    @Test
    public void testPaymentSystemMasterCardElectronicCard() {
        final String mastercardPaymentType;
        mastercardPaymentType = "Mir";
        assertEquals(mastercardPaymentType,
                paymentCardMastercard.getPaymentSystem());
    }

    @Test
    public void testMirIIN() {
        assertTrue(checkFourNumberIIN());
    }

    private boolean checkFourNumberIIN() {
        int iin = getIIN(4);
        return (iin >= PaymentCardMir.IIN_2200 && iin <= PaymentCardMir.IIN_2204);
    }

    private int getIIN(int iinLength) {
        String iinNumber = "";
        for (int i = 0; i < iinLength; i++) {
            iinNumber += paymentCardMastercard.getPaymentCardNumber()[i];
        }
        return Integer.parseInt(iinNumber);
    }
}
