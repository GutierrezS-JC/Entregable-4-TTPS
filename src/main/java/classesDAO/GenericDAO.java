package classesDAO;

import java.util.List;

public interface GenericDAO<T> {

	public T update(T entity);
	
	public void delete(T entity);
	
	public T delete(Integer id);
	
	public boolean exists(Integer id);
	
	public T persist(T entity);
	
	public T get(Integer id);
	
	public List<T> getAll(String column);
	
}
