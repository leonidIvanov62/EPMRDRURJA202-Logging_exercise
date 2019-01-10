package leonid_ivanov.payment_card.mastercard;

/**
 * This class describes a payment card Mastercard Maestro
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardMastercardMaestro extends PaymentCardMastercard {

	private static final String PAYMENT_SYSTEM_TYPE = "Maestro";
	/**
	 * Constructor of class PaymentCardMastercardMaestro
	 */
	public PaymentCardMastercardMaestro() {
		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}
}
