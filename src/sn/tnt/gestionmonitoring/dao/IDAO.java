package sn.tnt.gestionmonitoring.dao;

import java.util.List;

public interface IDAO<T> {
	
	public void ajouter(T t);

	public List<T> getAll();

	public void delete(T t);

	public void update(T t);
	
	public void editer (T t);
	
	//public T findByEmail(String email);
}
