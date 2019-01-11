package leonid_ivanov.payment_card.visa;

import leonid_ivanov.payment_card.PaymentCard;

/**
 * This class describes a payment card Visa
 * 
 * @author Leonid_Ivanov
 *
 */
public abstract class PaymentCardVisa extends PaymentCard {

	public static final int IIN_4 = 4;
	private static final int IIN_COUNT_1 = 1;
	private static final int PCN_COUNT = 16;
	private static final String PAYMENT_SYSTEM = "VISA";

	public PaymentCardVisa() {
		super.createPaymentCardNumber(setIssuerIdentificationNumber(), PCN_COUNT);
		super.setPaymentSystem(PAYMENT_SYSTEM);
	}

	@Override
	protected int[] setIssuerIdentificationNumber() {

		int[] IssuerIdentificationNumber = new int[IIN_COUNT_1];
		IssuerIdentificationNumber[0] = 4;

		return IssuerIdentificationNumber;

	}

}
