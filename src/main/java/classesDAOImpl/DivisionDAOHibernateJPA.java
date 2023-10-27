package classesDAOImpl;

import classesDAO.DivisionDAO;
import models.Division;

public class DivisionDAOHibernateJPA extends GenericDAOHibernateJPA<Division> implements DivisionDAO {
	
	public DivisionDAOHibernateJPA() {
		super(Division.class);
	}
}
