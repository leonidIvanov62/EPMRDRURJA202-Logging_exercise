package leonid_ivanov.runner;

import leonid_ivanov.payment_card.PaymentCard;
import leonid_ivanov.payment_card.PaymentCardGenerator;

import java.util.Set;

/**
 * The application's main class
 * 
 * @author Leonid_Ivanov
 *
 */
public class CardGenerator {

	public static final int CREDIT_CARD_INDEX = 0;
	public static final int COUNT_INDEX = 1;
	public static final int EXIT_INDEX = 0;

	/**
	 * Main method of Card Generator project
	 * 
	 * @param args -- application settings
	 */
	public static void main(String[] args) {
		CardGenerator applicationRunnner = new CardGenerator();
		applicationRunnner.startCardGenerator(args);
	}

	/**
	 * Starts the execution of the application
	 * 
	 * @param args -- application settings
	 */
	public void startCardGenerator(String[] args) {
		int cardsCount = CREDIT_CARD_INDEX;
		try {
			cardsCount = Integer.parseInt(args[COUNT_INDEX]);
		} catch (NumberFormatException ex) {
			System.err.println("Wrong number of cards");
			System.exit(EXIT_INDEX);
		}
		PaymentCardGenerator paymentCardGenerator = null;
		try {
			paymentCardGenerator = new PaymentCardGenerator(args[CREDIT_CARD_INDEX], cardsCount);
		} catch (InstantiationException | IllegalArgumentException | IllegalAccessException e) {
			System.err.println("Wrong crefit card type" + args[CREDIT_CARD_INDEX]);
			System.exit(EXIT_INDEX);
		}
		Set<PaymentCard> set = paymentCardGenerator.getPaymentCardSet();
		for (PaymentCard paymentCard : set) {
			System.out.println(paymentCard.toString());
		}
	}

}
