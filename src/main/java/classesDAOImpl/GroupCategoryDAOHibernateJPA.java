package classesDAOImpl;

import classesDAO.GroupCategoryDAO;
import models.GroupCategory;

public class GroupCategoryDAOHibernateJPA extends GenericDAOHibernateJPA<GroupCategory> implements GroupCategoryDAO{
	
	public GroupCategoryDAOHibernateJPA() {
		super(GroupCategory.class);
	}
}
