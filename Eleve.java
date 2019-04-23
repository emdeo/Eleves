package m2i.java.projet1;

import java.util.ArrayList;

public class Eleve extends Personne implements ICalcul {
	private ArrayList<Note> lstNotes = new ArrayList<Note>();

	public Eleve(String nom, String prenom, ArrayList<Note> lstNotes) {
		super(nom, prenom);
		this.lstNotes = lstNotes;
	}
	
	public Eleve(String nom, String prenom) {
		super(nom, prenom);
	}

	@Override
	public float Moyenne() {
		if (lstNotes.size() == 0)
			return -99;
		
		float somme = 0f;
		float sommeCoef = 0;
		
		for (Note elem:lstNotes) {
			somme += elem.getValeur();
			sommeCoef += elem.getCoef();
		}
		
		return somme / sommeCoef;
	}

	@Override
	public float Moyenne(Matiere mat) {
		if (lstNotes.size() == 0)
			return -99;
		
		float somme = 0f;
		float sommeCoef = 0;
		
		for (Note elem:lstNotes) {
			if (elem.getMatiere() == mat) {
				somme += elem.getValeur();
				sommeCoef += elem.getCoef();
			}
		}
		
		return somme / sommeCoef;
	}
	
	public void Afficher() {
		System.out.println(this.prenom + " " + this.nom);
		
		for (Matiere elem:Matiere.values()) {
				System.out.println(elem + "\t" + Moyenne(elem));
		}
	}
}
