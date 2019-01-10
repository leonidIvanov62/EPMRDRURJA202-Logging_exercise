package leonid_ivanov.payment_card.mastercard;

/**
 * This class describes a payment card Mastercard Electronic
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardMastercardElectronic extends PaymentCardMastercard {

	private static final String PAYMENT_SYSTEM_TYPE = "Electronic";
	/**
	 * Constructor of class PaymentCardMastercardElectronic
	 */
	public PaymentCardMastercardElectronic() {
		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}



}
