package Day5;

public class SBI extends Gpay{
		private double balance=15000;
		private int pin = 1234;

		@Override
		public void makePayment(double amount) {
			if(amount<balance) {
				balance-=amount;
				String transDetails="Payment of rs."+amount+"name using SBI:";
				recordTranscation(transDetails);
			}
			
		}

		@Override
		public void checkBalance(int pin) {
			if(this.pin==pin) {
				System.out.println("you balance is"+balance);
			}
			else {
				System.out.println("Invalid Pin numer");
				
			}	
			}
			
			
		}



