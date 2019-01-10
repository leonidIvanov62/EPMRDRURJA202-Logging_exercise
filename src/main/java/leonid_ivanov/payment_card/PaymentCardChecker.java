package leonid_ivanov.payment_card;

public class PaymentCardChecker {

	public PaymentCardChecker() {

	}

	/**
	 * Check the card number with the Luhn algorithm
	 * 
	 * @return is the card number correct
	 */
	public boolean checkLuhn(PaymentCard paymentCard) {
		int sum = 0;
		int length = paymentCard.getPaymentCardNumber().length;
		for (int i = 0; i < length; i++) {

			// get digits in reverse order
			int digit = paymentCard.getPaymentCardNumber()[length - i - 1];

			// every 2nd number multiply by 2
			if (i % 2 == 1) {
				digit *= 2;
			}
			sum += digit > 9 ? digit - 9 : digit;
		}
		return sum % 10 == 0;
	}
}
