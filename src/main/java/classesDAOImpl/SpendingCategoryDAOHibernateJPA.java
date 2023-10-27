package classesDAOImpl;

import classesDAO.SpendingCategoryDAO;
import models.SpendingCategory;

public class SpendingCategoryDAOHibernateJPA extends GenericDAOHibernateJPA<SpendingCategory>
		implements SpendingCategoryDAO {
	
	public SpendingCategoryDAOHibernateJPA() {
		super(SpendingCategory.class);
	}
}