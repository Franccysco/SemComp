package br.com.semComp.model;

import javax.persistence.Persistence;

public class CriarBanco {

	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("SemComp");
	}
	
}
