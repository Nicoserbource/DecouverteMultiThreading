package nmetivier.com;

public class Program {

	public static void main(String[] args) {
		
		// (new HelloThread()).start();	// On créer un thread qu'on ne stock pas dans une
										// variable.
										// 
		
		Thread monThread1 = new HelloThread("Thread n°1", 0);
		monThread1.start();

		Thread monThread2 = new HelloThread("Thread n°2", -99999);
		monThread2.start();
	}

}
