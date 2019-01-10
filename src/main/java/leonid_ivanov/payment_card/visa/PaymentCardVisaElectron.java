package leonid_ivanov.payment_card.visa;

/**
 * This class describes a payment card Visa Electron
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardVisaElectron extends PaymentCardVisa {

	
	private static final String PAYMENT_SYSTEM_TYPE = "Electron";
	/**
	 * Constructor of class PaymentCardVisaElectron
	 */
	public PaymentCardVisaElectron() {
		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}
}
