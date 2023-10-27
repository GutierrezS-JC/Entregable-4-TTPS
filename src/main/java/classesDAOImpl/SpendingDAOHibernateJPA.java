package classesDAOImpl;

import classesDAO.SpendingDAO;
import models.Spending;

public class SpendingDAOHibernateJPA extends GenericDAOHibernateJPA<Spending> implements SpendingDAO {

	public SpendingDAOHibernateJPA() {
		super(Spending.class);
	}
}
