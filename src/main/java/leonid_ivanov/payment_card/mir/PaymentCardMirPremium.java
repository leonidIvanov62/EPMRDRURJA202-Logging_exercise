package leonid_ivanov.payment_card.mir;

/**
 * This class describes a payment card Mir Premium
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardMirPremium extends PaymentCardMir {
	
	private static final String PAYMENT_SYSTEM_TYPE = "Premium";
	/**
	 * Constructor of class PaymentCardMirPremium
	 */
	public PaymentCardMirPremium() {

		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}

}
