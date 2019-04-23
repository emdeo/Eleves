package m2i.java.projet1;

import java.time.LocalDate;

public class Note {
	private float valeur;
	private int coef;
	private LocalDate date;
	private Matiere matiere;
	
	public Note(float valeur, int coef, LocalDate date, Matiere matiere) {
		super();
		this.valeur = valeur;
		this.coef = coef;
		this.date = date;
		this.matiere = matiere;
	}
	
	public Note() {
		super();
	}

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
}
