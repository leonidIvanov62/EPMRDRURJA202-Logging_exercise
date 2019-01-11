package leonid_ivanov_test.payment_card.mir;

import leonid_ivanov.payment_card.mir.PaymentCardMirDebit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentCardMirDebitTest {
    /*
     *  Payment card Mir Debit
     */
    private PaymentCardMirDebit paymentCardMirDebit;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardMirDebit = new PaymentCardMirDebit();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorMirDebitCard() {
        assertNotNull(paymentCardMirDebit);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeMirDebitCard() {
        final String mirDebitType;
        mirDebitType = "Debit";
        assertEquals(mirDebitType,
                paymentCardMirDebit.getPaymentCardType());
    }
}
