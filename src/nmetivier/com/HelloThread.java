package nmetivier.com;

/**
 * Création d'une classe qui dérive (classe fille) de Thread (classe mere)
 * @author Nicolas.Metivier
 *
 */
public class HelloThread extends Thread {
	
	private int compteur;
	
	/**
	 * Constructeur par défaut pour la classe HelloThread.
	 */
	public HelloThread(String nomThread, int compteur) {
		super(nomThread);	// On fait appel au constructeur de Thread 
								// qui prend une surcharge correspondant au nom
								// du thread.
		this.compteur = compteur;
	}
	
	/**
	 * Fonction qui sera appellée lorsque l'on va faire un thread.start().
	 */
	public void run() {
		String message = String.format("Nom du thread %S %S",super.getName(), super.getId());
		System.out.println(message);
		for (int i = 0; i < 100; i++) {
			System.out.println(String.format("Valeur du compteur du thread %S : %S",super.getName(), this.compteur));
			this.compteur ++;
			
			if (super.getName().equals("Thread n°1") && (i == 50 )) {
				try {
					System.out.println("********** Nous allons mettre en pause le thread " + super.getName());
					super.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(String.format("---------- Le thread %S s'arrete. ----------", super.getName()));
	}
	
}
