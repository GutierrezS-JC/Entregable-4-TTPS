package classesDAOImpl;

import classesDAO.PaymentDAO;
import models.Payment;

public class PaymentDAOHibernateJPA extends GenericDAOHibernateJPA<Payment> implements PaymentDAO{

	public PaymentDAOHibernateJPA() {
		super(Payment.class);
	}

}
