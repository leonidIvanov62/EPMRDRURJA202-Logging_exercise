package leonid_ivanov_test.payment_card.mir;

import leonid_ivanov.payment_card.mir.PaymentCardMirClassic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentCardMirClassicTest {
    /*
     *  Payment card Mir classic
     */
    private PaymentCardMirClassic paymentCardMirClassic;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardMirClassic = new PaymentCardMirClassic();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorMirClassicCard() {
        assertNotNull(paymentCardMirClassic);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeMirClassicCard() {
        final String mirClassicType;
        mirClassicType = "Classic";
        assertEquals(mirClassicType,
                paymentCardMirClassic.getPaymentCardType());
    }
}
