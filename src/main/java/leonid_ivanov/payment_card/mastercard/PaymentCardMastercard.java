package leonid_ivanov.payment_card.mastercard;

import leonid_ivanov.payment_card.PaymentCard;

import java.util.Random;

/**
 * This class describes a payment card Mastercard
 * 
 * @author Leonid_Ivanov
 *
 */
public abstract class PaymentCardMastercard extends PaymentCard {

	public static final int IIN_COUNT_2 = 2;
	public static final int IIN_COUNT_4 = 4;
	public static final int PCN_COUNT = 20;
	public static final int IIN_5 = 5;
	public static final int IIN_3 = 3;
	public static final int IIN_1 = 1;
	public static final int IIN_1O = 10;
	public static final int IIN_2720 = 2720;
	public static final int IIN_2221 = 2221;
	public static final int IIN_51 = 51;
	public static final int IIN_55 = 55;

	public static final String PAYMENT_SYSTEM = "Mastercard";

	/**
	 * Constructor of class PaymentCardMastercard
	 */
	public PaymentCardMastercard() {
		super.createPaymentCardNumber(setIssuerIdentificationNumber(), PCN_COUNT);
		super.setPaymentSystem(PAYMENT_SYSTEM);
	}

	@Override
	protected int[] setIssuerIdentificationNumber() {
		Random rnd = new Random();
		int[] IssuerIdentificationNumber = null;

		if (rnd.nextBoolean()) {
			IssuerIdentificationNumber = new int[IIN_COUNT_2];
			IssuerIdentificationNumber[0] = IIN_5;
			IssuerIdentificationNumber[1] = (rnd.nextInt(IIN_5) + IIN_1);

		} else {
			IssuerIdentificationNumber = new int[IIN_COUNT_4];
			int number = (int) (Math.random() * (IIN_2720 - IIN_2221) + IIN_2221);
			int j = IIN_3;
			while (number > 0) {
				IssuerIdentificationNumber[j] = number % IIN_1O;
				number /= IIN_1O;
				j--;
			}
		}
		return IssuerIdentificationNumber;

	}
}
