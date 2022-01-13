package fr.main.jeremy;

import fr.exo.Imprimante;

public class Main {

	public static void main(String[] args) {
		Imprimante imprimante = Imprimante.getInstance();
		imprimante.ajoutPapier(3);
		imprimante.imprimer();
		imprimante.imprimer();
		imprimante.imprimer();
		imprimante.imprimer();
		Imprimante imprimanteDeux = Imprimante.getInstance();
		imprimanteDeux.imprimer();
		System.out.println("test");
	}

}
