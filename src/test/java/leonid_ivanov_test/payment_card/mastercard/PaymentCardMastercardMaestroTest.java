package leonid_ivanov_test.payment_card.mastercard;

import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardMaestro;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertNotNull;

public class PaymentCardMastercardMaestroTest {
    /*
     *  Payment card Mastercard Electronic
     */
    private PaymentCardMastercardMaestro paymentCardMastercardMaestro;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardMastercardMaestro = new PaymentCardMastercardMaestro();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorMasterCardElectronicCard() {
        assertNotNull(paymentCardMastercardMaestro);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeMasterCardElectronicCard() {
        final String mastercardElectonicSystemType;
        mastercardElectonicSystemType = "Maestro";
        Assert.assertEquals(mastercardElectonicSystemType,
                paymentCardMastercardMaestro.getPaymentCardType());
    }
}
