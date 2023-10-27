package classesDAOImpl;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMF {
	private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("unlp");

	public static EntityManagerFactory getEMF() {
		return em;
	}
}
