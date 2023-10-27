package classesDAOImpl;

import classesDAO.UserDAO;
import models.User;

public class UserDAOHibernateJPA extends GenericDAOHibernateJPA<User> implements UserDAO {

	public UserDAOHibernateJPA() {
		super(User.class);
	}
}
