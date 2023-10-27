package classesDAO;

import classesDAOImpl.UserDAOHibernateJPA;

public class FactoryDAO {
	
	public static UserDAO getUserDAO() {
		return new UserDAOHibernateJPA();
	}
}