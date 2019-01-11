package leonid_ivanov_test.payment_card.visa;

import leonid_ivanov.payment_card.visa.PaymentCardVisaGold;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentCardVisaGoldTest {
    /*
     *  Payment card Visa Gold
     */
    private PaymentCardVisaGold paymentCardVisaGold;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardVisaGold = new PaymentCardVisaGold();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorVisaGoldCard() {
        assertNotNull(paymentCardVisaGold);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeVisaGoldCard() {
        final String visaGoldType;
        visaGoldType = "Gold";
        assertEquals(visaGoldType,
                paymentCardVisaGold.getPaymentCardType());
    }
}
