package leonid_ivanov.payment_card.visa;

/**
 * This class describes a payment card Visa Classic
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardVisaClassic extends PaymentCardVisa {
	
	private static final String PAYMENT_SYSTEM_TYPE = "Classic";
	/**
	 * Constructor of class PaymentCardVisaElectron
	 */
	public PaymentCardVisaClassic() {
		super.setPaymentCardType(PAYMENT_SYSTEM_TYPE);
	}
}
