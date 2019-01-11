package leonid_ivanov_test.payment_card.visa;

import leonid_ivanov.payment_card.visa.PaymentCardVisaElectron;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PaymentCardVisaElectronTest {
    /*
     *  Payment card Visa Electron
     */
    private PaymentCardVisaElectron paymentCardVisaElectron;

    /**
     * Creates new payment card
     */
    @Before
    public void createCard() {
        paymentCardVisaElectron = new PaymentCardVisaElectron();
    }

    /**
     * Tests payment card object is not null
     */
    @Test
    public void testConstructorVisaElectronCard() {
        assertNotNull(paymentCardVisaElectron);
    }

    /**
     * Test payment card system type
     */
    @Test
    public void testPaymentSystemTypeVisaElectronCard() {
        final String visaElectronType;
        visaElectronType = "Electron";
        assertEquals(visaElectronType,
                paymentCardVisaElectron.getPaymentCardType());
    }
}
