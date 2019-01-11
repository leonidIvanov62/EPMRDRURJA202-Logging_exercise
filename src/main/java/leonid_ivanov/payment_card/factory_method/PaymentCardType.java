package leonid_ivanov.payment_card.factory_method;

import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardElectronic;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardMaestro;
import leonid_ivanov.payment_card.mastercard.PaymentCardMastercardMasterCard;
import leonid_ivanov.payment_card.mir.PaymentCardMirClassic;
import leonid_ivanov.payment_card.mir.PaymentCardMirDebit;
import leonid_ivanov.payment_card.mir.PaymentCardMirPremium;
import leonid_ivanov.payment_card.visa.PaymentCardVisaClassic;
import leonid_ivanov.payment_card.visa.PaymentCardVisaElectron;
import leonid_ivanov.payment_card.visa.PaymentCardVisaGold;

import java.util.HashMap;

public enum PaymentCardType {
	VISA_CLASSIC(PaymentCardVisaClassic.class),
	VISA_ELECTRON(PaymentCardVisaElectron.class),
	VISA_GOLD(PaymentCardVisaGold.class),
	MASTERCARD_MASTERCARD(PaymentCardMastercardMasterCard.class),
	MASTERCARD_MAESTRO(PaymentCardMastercardMaestro.class),
	MASTERCARD_ELECTRONIC(PaymentCardMastercardElectronic.class),
	MIR_CLASSIC(PaymentCardMirClassic.class),
	MIR_PREMIUM(PaymentCardMirPremium.class),
	MIR_DEBIT(PaymentCardMirDebit.class);

	private Class paymentCard;

	PaymentCardType(Class paymentCard) {
		this.paymentCard = paymentCard;
	}

	public Class getCard() {
		return paymentCard;
	}

}
