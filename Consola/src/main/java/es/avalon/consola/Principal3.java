package es.avalon.consola;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.avalon.jpa.negocio.Capitulo;

public class Principal3 {

	public static void main(String[] args) {
	
	
			
	insertarCapitulo();
	}

	
	private static void insertarCapitulo() {
		Capitulo capitulo = new Capitulo("Capitulo_1", 50);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadLibros");

		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			// persist: inserta
			em.persist(capitulo);
			em.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();

		}
	}
}
