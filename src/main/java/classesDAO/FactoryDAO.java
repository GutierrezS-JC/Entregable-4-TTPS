package classesDAO;

import classesDAOImpl.GroupDAOHibernateJPA;
import classesDAOImpl.UserDAOHibernateJPA;

public class FactoryDAO {
	
	public static UserDAO getUserDAO() {
		return new UserDAOHibernateJPA();
	}
	
	public static GroupDAO getGroupDAO() {
		return new GroupDAOHibernateJPA();
	}
}