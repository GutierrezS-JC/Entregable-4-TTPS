package classesDAOImpl;

import classesDAO.GroupDAO;
import models.Group;

public class GroupDAOHibernateJPA extends GenericDAOHibernateJPA<Group> implements GroupDAO{
	
	public GroupDAOHibernateJPA() {
		super(Group.class);
	}
}
