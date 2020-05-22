package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("V")

public class versement extends Operation   {

	public versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public versement(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}
	

}
