package leonid_ivanov.payment_card.mir;

/**
 * This class describes a payment card Mir Debit
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardMirDebit extends PaymentCardMir {
	
	private static final String PAYMENT_SYSTEM_TYPE = "Debit";
	/**
	 * Constructor of class PaymentCardMirPremium
	 */
	public PaymentCardMirDebit() {

		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}
}
