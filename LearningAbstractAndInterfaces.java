package coreJava;

public class LearningAbstractAndInterfaces {

	abstract class Payment {

		void generateReceipt() {
			System.out.println("Receipt generated");
		}

		abstract void makePayment();
	}

	interface UPI {
		void payThroughUPI();
	}

	class GooglePay extends Payment implements UPI {

		@Override
		void makePayment() {
			System.out.println("Payment is done through Bank server ");
		}

		public void payThroughUPI() {
			System.out.println("UPI Payment ");
		}
	}
}