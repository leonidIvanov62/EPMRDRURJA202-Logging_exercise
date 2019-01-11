package leonid_ivanov_test.payment_card.mir;

import leonid_ivanov.payment_card.mir.PaymentCardMirPremium;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentCardMirPremiumTest {
    /*
     *  Payment card Mir classic
     */
    private PaymentCardMirPremium paymentCardMirPremium;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardMirPremium = new PaymentCardMirPremium();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorMirPremiumCard() {
        assertNotNull(paymentCardMirPremium);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeMirPremiumCard() {
        final String mirPremiumType;
        mirPremiumType = "Premium";
        assertEquals(mirPremiumType,
                paymentCardMirPremium.getPaymentCardType());
    }
}
