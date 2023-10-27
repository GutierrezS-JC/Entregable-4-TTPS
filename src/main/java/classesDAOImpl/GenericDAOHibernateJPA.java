package classesDAOImpl;

import java.util.List;

import classesDAO.GenericDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {

	protected Class<T> persistentClass;

	public GenericDAOHibernateJPA(Class<T> clase) {
		this.persistentClass = clase;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();

		etx.begin();
		T entityMerged = em.merge(entity);
		etx.commit();
		em.close();

		return entityMerged;
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = null;

		try {
			etx = em.getTransaction();
			etx.begin();
			em.remove(em.merge(entity));
			etx.commit();
		} catch (RuntimeException e) {
			if (etx != null && etx.isActive())
				etx.rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	@Override
	public T delete(Integer id) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEMF().createEntityManager();

		T entity = em.find(this.getPersistentClass(), id);
		if (entity != null) {
			em.remove(entity);
		}
		em.close();

		return entity;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEMF().createEntityManager();

		T entity = em.find(this.getPersistentClass(), id);
		if (entity != null) {
			return true;
		}
		return false;
	}

	@Override
	public T persist(T entity) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = null;

		try {
			etx = em.getTransaction();
			etx.begin();
			em.persist(entity);
			etx.commit();
		} catch (RuntimeException e) {
			if (etx != null && etx.isActive())
				etx.rollback();
			throw e;
		} finally {
			em.close();
		}
		return entity;
	}

	@Override
	public T get(Integer id) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getEMF().createEntityManager();
		T entity = em.find(this.getPersistentClass(), id);
		em.close();

		return entity;
	}

	@Override
	public List<T> getAll(String column) {
		// TODO Auto-generated method stub
		Query consulta = EMF.getEMF().createEntityManager()
				.createQuery("select e from " + getPersistentClass().getSimpleName() + " e order by e." + column);
		List<T> resultado = (List<T>) consulta.getResultList();
		return resultado;
	}

}
