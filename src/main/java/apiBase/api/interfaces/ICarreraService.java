package apiBase.api.interfaces;

import java.util.List;

public interface ICarreraService<T> {

	
	public List<T> getAll();
	
	public T getByid(long id);
	
	public T createOrUpdate(T entity);
	
	public T deleteById(Long id);
}
