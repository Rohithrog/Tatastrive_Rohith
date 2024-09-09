package Day5;

import java.util.ArrayList;

public abstract class Gpay {
	
	
	private ArrayList <String> Transcation = new ArrayList <String>();
	
	public abstract void makePayment(double amount);
	public abstract void checkBalance(int pin);
	
	public void commonFeauture() {
		System.out.println("Processing payment through Gpay Platform......");
	}
	public void recordTranscation(String transDetails) {
		Transcation.add(transDetails);
		
	}
	public void showHistory() {
		Transcation.forEach(s->System.out.println(s));
	}
}
