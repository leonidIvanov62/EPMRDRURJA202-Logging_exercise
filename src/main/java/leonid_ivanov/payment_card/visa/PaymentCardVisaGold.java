package leonid_ivanov.payment_card.visa;

/**
 * This class describes a payment card Visa Gold
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardVisaGold extends PaymentCardVisa {

	private static final String PAYMENT_SYSTEM_TYPE = "Gold";

	/**
	 * Constructor of class PaymentCardVisaGold
	 */
	public PaymentCardVisaGold() {
		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}
}
