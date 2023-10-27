package classesDAOImpl;

import classesDAO.UserContactDAO;
import models.UserContact;

public class UserContactDAOHibernateJPA extends GenericDAOHibernateJPA<UserContact> implements UserContactDAO {
	
	public UserContactDAOHibernateJPA() {
		super(UserContact.class);
	}
}
