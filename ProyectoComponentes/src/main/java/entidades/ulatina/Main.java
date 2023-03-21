package entidades.ulatina;

import javax.persistence.*;

public class Main {
	
	
		private static EntityManager em = null;
		private static EntityManagerFactory entityManagerFactory = null;

	public static void main(String[] args) {
		try {
			
			System.out.println("INICIANDO");
			
			startEntityManagerFactory("proyectocomponentes");
			em = entityManagerFactory.createEntityManager();

			em.getTransaction().begin();

			//Aqui iniciamos....
			
			
			System.out.println("Cerrando");
			stopEntityManagerFactory();
			 
		}
		catch (Exception e) {
			
		}

	}
	
	public static void startEntityManagerFactory(String persistenceUnit) throws Exception {

		if (entityManagerFactory == null) {

		try {

		entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);

		} catch (Exception e) {

		e.printStackTrace();

		}

		}

		}

		public static void stopEntityManagerFactory() throws Exception {

		if (entityManagerFactory != null) {

		if (entityManagerFactory.isOpen()) {

		try {

		entityManagerFactory.close();

		} catch (Exception e) {

		e.printStackTrace();

		}

		}

		entityManagerFactory = null;

		}

		}

}
