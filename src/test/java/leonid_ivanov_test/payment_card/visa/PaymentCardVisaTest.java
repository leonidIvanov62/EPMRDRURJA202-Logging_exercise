package leonid_ivanov_test.payment_card.visa;

import leonid_ivanov.payment_card.visa.PaymentCardVisa;
import leonid_ivanov.payment_card.visa.PaymentCardVisaClassic;
import leonid_ivanov.payment_card.visa.PaymentCardVisaElectron;
import leonid_ivanov.payment_card.visa.PaymentCardVisaGold;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class PaymentCardVisaTest {
    private PaymentCardVisa paymentCardVisa;

    public PaymentCardVisaTest(PaymentCardVisa paymentCardVisa) {
        this.paymentCardVisa = paymentCardVisa;
    }

    @Parameterized.Parameters(name = "{index}: PaymentCard: {0}")
    public static Iterable<Object> data() {
        PaymentCardVisa[] dataArray = {
                new PaymentCardVisaClassic(),
                new PaymentCardVisaElectron(),
                new PaymentCardVisaGold()};
        return Arrays.asList(dataArray);
    }


    /**
     * Test payment card payment system type
     */
    @Test
    public void testPaymentSystemVisaCard() {
        final String visaPaymentType;
        visaPaymentType = "VISA";
        assertEquals(visaPaymentType,
                paymentCardVisa.getPaymentSystem());
    }

    @Test
    public void testMirIIN() {
        assertTrue(paymentCardVisa.getPaymentCardNumber()[0] == PaymentCardVisa.IIN_4);
    }


}
