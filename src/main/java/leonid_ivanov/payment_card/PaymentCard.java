package leonid_ivanov.payment_card;

import java.util.Random;

/**
 * This class describes a payment card
 * 
 * @author Leonid_Ivanov
 *
 */
public abstract class PaymentCard {
	/**
	 * Payment card number
	 */
	private int[] paymentCardNumber;
	/**
	 * Payment card system
	 */
	private String paymentSystem;
	/**
	 * Payment card type
	 */
	private String paymentCardType;

	/**
	 * Constructor of class PaymentCard
	 */
	public PaymentCard() {
	}

	/**
	 * @return the paymentSystem
	 */
	public String getPaymentSystem() {
		return paymentSystem;
	}

	/**
	 * @param paymentSystem the paymentSystem to set
	 */
	public void setPaymentSystem(String paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	/**
	 * @return the paymentCardType
	 */
	public String getPaymentCardType() {
		return paymentCardType;
	}

	/**
	 * @param paymentCardType the paymentCardType to set
	 */
	public void setPaymentCardType(String paymentCardType) {
		this.paymentCardType = paymentCardType;
	}

	/**
	 * Returns payment card number
	 * 
	 * @return payment card number
	 */
	public int[] getPaymentCardNumber() {
		return paymentCardNumber;
	}

	/**
	 * Set payment card number
	 * 
	 * @param paymentCardNumber -- payment card number
	 */
	protected void setPaymentCardNumber(int[] paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}

	/**
	 * Create payment card number
	 */
	protected void createPaymentCardNumber(int[] issuerIdentificationNumber, int diggitsNuber) {

		int[] paymentCardNumber = new int[diggitsNuber];
		System.arraycopy(issuerIdentificationNumber, 0, paymentCardNumber, 0, issuerIdentificationNumber.length);
		Random rnd = new Random();
		for (int i = issuerIdentificationNumber.length; i < diggitsNuber - 1; i++) {
			paymentCardNumber[i] = rnd.nextInt(10);
		}
		paymentCardNumber[paymentCardNumber.length - 1] = getLastDigitPaymentCard(paymentCardNumber);
		setPaymentCardNumber(paymentCardNumber);
	}

	/**
	 * Return last right digit of payment card number with Luhn algorithm
	 * 
	 * @param paymentCardNumber - payment card number
	 * @return - last digit of credit card number
	 */
	private int getLastDigitPaymentCard(int[] paymentCardNumber) {
		int sum = 0;
		for (int i = paymentCardNumber.length - 1; i > -1; i--) {
			int p = paymentCardNumber[i];
			if (i % 2 != 0) {
				p *= 2;
			}
			if (p > 9) {
				p = p - 9;
			}

			sum += p;
		}
		sum = 10 - (sum % 10);
		if (sum == 10) {
			sum = 1;
		}
		return sum;
	}

	/**
	 * Set issuer identification number
	 * 
	 * @return
	 */
	protected abstract int[] setIssuerIdentificationNumber();

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(paymentSystem.toUpperCase()).append("_").append(paymentCardType.toUpperCase()).append(" ");
		result.append("[");
		for (int i = 0; i < paymentCardNumber.length; i++) {
			result.append(paymentCardNumber[i]);
		}
		result.append("]");
		return result.toString();
	}

}
