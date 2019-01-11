package leonid_ivanov_test.payment_card.mastercard;

import static org.junit.Assert.assertEquals;

import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardMaestro;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertNotNull;

public class PaymentCardMastercardMasterCardTest {
    /*
     *  Payment card Mastercard Electronic
     */
    private PaymentCardMastercardMaestro paymentCardMastercardMasterCard;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardMastercardMasterCard = new PaymentCardMastercardMaestro();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorMasterCardElectronicCard() {
        assertNotNull(paymentCardMastercardMasterCard);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeMasterCardElectronicCard() {
        final String mastercardElectonicSystemType;
        mastercardElectonicSystemType = "MasterCard";
        assertEquals(mastercardElectonicSystemType,
                paymentCardMastercardMasterCard.getPaymentCardType());
    }
}
