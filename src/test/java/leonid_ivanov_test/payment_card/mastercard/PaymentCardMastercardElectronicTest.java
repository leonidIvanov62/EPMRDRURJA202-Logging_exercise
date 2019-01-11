package leonid_ivanov_test.payment_card.mastercard;

import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardElectronic;
import leonid_ivanov.payment_card.PaymentCard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentCardMastercardElectronicTest {

    /*
     *  Payment card Mastercard Electronic
     */
    private PaymentCardMastercardElectronic paymentCardMastercardElectronic;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardMastercardElectronic = new PaymentCardMastercardElectronic();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorMasterCardElectronicCard() {
        assertNotNull(paymentCardMastercardElectronic);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeMasterCardElectronicCard() {
        final String mastercardElectonicSystemType;
        mastercardElectonicSystemType = "Electronic";
        assertEquals(mastercardElectonicSystemType,
                paymentCardMastercardElectronic.getPaymentCardType());
    }
}