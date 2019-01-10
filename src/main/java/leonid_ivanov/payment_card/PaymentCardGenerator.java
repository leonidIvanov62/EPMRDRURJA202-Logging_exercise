package leonid_ivanov.payment_card;

import leonid_ivanov.payment_card.factory_method.PaymentCardType;

import java.util.HashSet;

/**
 * This class describes methods for generating payment cards
 * 
 * @author Leonid_Ivanov
 *
 */
public class PaymentCardGenerator {

    /**
     * Payment card set
     */
    private HashSet<PaymentCard> paymentCardSet;

    /**
     * Constructor of class PaymentCardGenerator
     * 
     * @param paymentSystem     -- payment system
     * @param paymentSystemType -- payment system type
     * @param count             -- count of payment cards
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public PaymentCardGenerator(String paymentSystemType, int count)
            throws InstantiationException, IllegalAccessException {
        setPaymentCardSet(paymentSystemType, count);
    }

    /**
     * Set payment card set
     * 
     * @param paymentSystem     -- payment system
     * @param paymentSystemType -- payment system type
     * @param count             -- count of payment cards
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private void setPaymentCardSet(String paymentSystemType, int count)
            throws InstantiationException, IllegalAccessException {
        paymentCardSet = createPaymentCardSet(paymentSystemType, count);
    }

    /**
     * Makes up a set of payment cards
     * 
     * @param paymentSystemType -- payment system type
     * @param count             -- count of payment cards
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public HashSet<PaymentCard> createPaymentCardSet(String paymentSystemType,
            int count) throws InstantiationException, IllegalAccessException {
        HashSet<PaymentCard> paymentCardSet = new HashSet<PaymentCard>();
        PaymentCardChecker paymentCardChecker = new PaymentCardChecker();
        for (int i = 0; i < count; i++) {
            PaymentCard paymentCard = (PaymentCard) PaymentCardType
                    .valueOf(paymentSystemType.toUpperCase()).getCard()
                    .newInstance();
            if (paymentCardChecker.checkLuhn(paymentCard)) {
                paymentCardSet.add(paymentCard);
            } else {
                i--;
            }
        }
        return paymentCardSet;
    }

    /**
     * Return a set of payment cards
     * 
     * @return set of payment cards
     */
    public HashSet<PaymentCard> getPaymentCardSet() {
        return paymentCardSet;
    }
}
