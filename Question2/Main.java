package Question2;

public class Main {
	public static void main(String...args) {
		
		 Bank bankA = new BankA();
	        Bank bankB = new BankB();
	        Bank bankC = new BankC();

	        System.out.println("Balance in Bank A: Rs." + bankA.getBalance());
	        System.out.println("Balance in Bank B: Rs." + bankB.getBalance());
	        System.out.println("Balance in Bank C: Rs." + bankC.getBalance());
	}
}
