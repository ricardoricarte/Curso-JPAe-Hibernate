package com.algaworks.curso.jpa2.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.algaworks.curso.jpa2.modelo.Proprietario;
import com.algaworks.curso.jpa2.util.JPAUtil;

public class ConsultaTiposBasicos {

	public static void main(String[] args) {
		EntityManagerFactory emf = JPAUtil.createEntityManager().getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		Proprietario proprietario = em.find(Proprietario.class, 1L);
		System.out.println("Nome: " + proprietario.getNome());
		
		for (String telefone : proprietario.getTelefones()) {
			System.out.println("Telefone: " + telefone);
		}
		
		em.close();
	}
	
}
