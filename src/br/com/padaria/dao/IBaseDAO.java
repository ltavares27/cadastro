package br.com.padaria.dao;

import java.util.List;

/**
 *
 * @author ltavares
 * @param <T>
 */
public interface IBaseDAO<T> {
    
    T save(T t);
    
    T update(T t);
    
    List<T> findAll();
    
    boolean delete(T t);
    
    T findById(Integer id);
}
