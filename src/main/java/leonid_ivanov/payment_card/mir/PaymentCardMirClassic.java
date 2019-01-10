package leonid_ivanov.payment_card.mir;

/**
 * This class describes a payment card Mir Classic
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardMirClassic extends PaymentCardMir {

	private static final String PAYMENT_SYSTEM_TYPE = "Classic";
	/**
	 * Constructor of class PaymentCardMirClassic
	 */
	public PaymentCardMirClassic() {

		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}

}
