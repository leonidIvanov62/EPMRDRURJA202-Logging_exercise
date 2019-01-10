package leonid_ivanov.payment_card.mir;

import leonid_ivanov.payment_card.PaymentCard;

import java.util.Random;

/**
 * This class describes a payment card Mir
 * 
 * @author Leonid_Ivanov
 *
 */
public abstract class PaymentCardMir extends PaymentCard {

	private static final int IIN_COUNT_4 = 4;
	private static final int PCN_COUNT = 16;
	private static final int IIN_5 = 5;
	private static final int IIN_2 = 2;
	private static final int IIN_0 = 0;
	private static final String PAYMENT_SYSTEM = "Mir";

	/**
	 * Constructor of class PaymentCardMir
	 */
	public PaymentCardMir() {
		super.createPaymentCardNumber(setIssuerIdentificationNumber(), PCN_COUNT);
		super.setPaymentSystem(PAYMENT_SYSTEM);
	}

	@Override
	protected int[] setIssuerIdentificationNumber() {
		Random rnd = new Random();
		int[] IssuerIdentificationNumber = new int[IIN_COUNT_4];
		IssuerIdentificationNumber[0] = IIN_2;
		IssuerIdentificationNumber[1] = IIN_2;
		IssuerIdentificationNumber[2] = IIN_0;
		IssuerIdentificationNumber[3] = rnd.nextInt(IIN_5);
		return IssuerIdentificationNumber;

	}

}
