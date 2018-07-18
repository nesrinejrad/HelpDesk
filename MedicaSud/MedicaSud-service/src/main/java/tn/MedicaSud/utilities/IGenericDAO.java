package tn.MedicaSud.utilities;

import java.util.List;

public interface IGenericDAO<T> {
	public void save(T entity);

	public void delete(T entity);

	public T update(T entity);

	public T find(String entityID);

	public List<T> findAll();

}
