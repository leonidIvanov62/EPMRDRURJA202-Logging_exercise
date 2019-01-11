package leonid_ivanov_test.payment_card.visa;

import leonid_ivanov.payment_card.visa.PaymentCardVisaClassic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentCardVisaClassicTest {
    /*
     *  Payment card Visa classic
     */
    private PaymentCardVisaClassic paymentCardVisaClassic;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardVisaClassic = new PaymentCardVisaClassic();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorVisaClassicCard() {
        assertNotNull(paymentCardVisaClassic);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeVisaClassicCard() {
        final String visaClassicType;
        visaClassicType = "Classic";
        assertEquals(visaClassicType,
                paymentCardVisaClassic.getPaymentCardType());
    }
}
