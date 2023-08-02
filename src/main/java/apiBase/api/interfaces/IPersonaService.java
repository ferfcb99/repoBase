package apiBase.api.interfaces;

import java.util.List;

public interface IPersonaService<T> {
    
    public List<T> getAll();

    public T getById(Long id);

    public T createOrUpdate(T entity);

    public T deleteById(Long id);

}
