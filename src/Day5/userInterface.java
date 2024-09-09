package Day5;
import java.util.Scanner;

public class userInterface {
	public static void main(String[]args) {
		Gpay gpay=new ICICI();
		ICICI icici=new ICICI();
		SBI sbi=new SBI();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
		System.out.println("User Interface\n------------------------------------");	
		System.out.println("1.Make Payment");	
		System.out.println("2.Check Balance");	
		System.out.println("3.See History");	
		System.out.println("4.Switch Bank");
		System.out.println("5.Exit");
ch=sc.nextInt();
switch(ch) {
case 1:
	System.out.println("Enter the amount: ");
	double amount=sc.nextDouble();
	gpay.makePayment(amount);
	break;
case 2:
	System.out.println("Enter the Pin: ");
	int pin=sc.nextInt();
	gpay.checkBalance(pin);
	break;
case 3:
	System.out.println("Transcation Details: \n---------------------------------------");
	gpay.showHistory();
	break;
case 4:
	System.out.println("\n1.ICICI \n2.SBI");
	int ch2=sc.nextInt();
	if(ch2==1) {
		gpay=icici;
		System.out.println("Gpay is switched to ICICI Bank ");
	}
	else if(ch2==2) {
		gpay=sbi;
		System.out.println("Gpay is switched to SBI Bank ");
	}
	break;
	
case 5:
	System.out.println("Thank you for using Gpay");
	break;
default:
	System.out.println("Invalid Option....");
}
		
		}while(ch!=6);
	}

}
