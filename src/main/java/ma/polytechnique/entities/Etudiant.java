package ma.polytechnique.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Etudiant implements Serializable {

	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String admis;
	
	
	
	public Etudiant() {
		super();
	
	}
	public Etudiant(int id, String nom, String admis, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.admis = admis;
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdmis() {
		return admis;
	}
	public void setAdmis(String admis) {
		this.admis = admis;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
