package classesDAOImpl;

import classesDAO.RecurrentDAO;
import models.Recurrent;

public class RecurrentDAOHibernateJPA extends GenericDAOHibernateJPA<Recurrent> implements RecurrentDAO {

	public RecurrentDAOHibernateJPA() {
		super(Recurrent.class);
	}

}
