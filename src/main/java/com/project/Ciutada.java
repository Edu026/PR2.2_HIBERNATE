package com.project;

import java.io.Serializable;

public class Ciutada implements Serializable {

	private long id;
	private long ciutatId;
	private String nom;
    private String cognom;
	private int edat;

	public Ciutada() { }

	public Ciutada(String nom, String cognom, int edat, long ciutatId) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
		this.ciutatId = ciutatId;
	}


	public long getId(){
		return this.id;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getCiutatId() {
		return this.ciutatId;
	}

	public void setCiutatId(long ciutatId) {
		this.ciutatId = ciutatId;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom(){
		return this.cognom;
	}

	public void setCognom(String cognom){
		this.cognom = cognom;
	}

	public int getEdat(){
		return this.edat;
	}

	public void setEdat(int edat){
		this.edat = edat;
	}



	@Override
    public String toString () {
      	return this.getNom() + " " + this.getCognom() + ", " + this.getEdat() + " - " + getCiutatId();
    }
}