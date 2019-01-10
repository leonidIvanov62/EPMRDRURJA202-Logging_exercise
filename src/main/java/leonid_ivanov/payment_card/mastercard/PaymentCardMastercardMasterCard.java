package leonid_ivanov.payment_card.mastercard;

/**
 * This class describes a payment card Mastercard MasterCard
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardMastercardMasterCard extends PaymentCardMastercard {

	private static final String PAYMENT_SYSTEM_TYPE = "MasterCard";
	/**
	 * Constructor of class PaymentCardMastercardMasterCard
	 */
	public PaymentCardMastercardMasterCard() {
		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}
}
