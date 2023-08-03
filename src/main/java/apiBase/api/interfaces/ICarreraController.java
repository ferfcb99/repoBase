package apiBase.api.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import apiBase.api.publics.Response;

public interface ICarreraController<T>{
	
    public ResponseEntity<Response<List<T>>> getAll();

    public ResponseEntity<Response<T>> getById(Long id);

    public ResponseEntity<Response<T>> createOrUpdate(T enitity);

    public ResponseEntity<Response<T>> deleteById(Long id);

}

