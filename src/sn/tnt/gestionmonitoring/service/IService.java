package sn.tnt.gestionmonitoring.service;

import java.util.List;

public interface IService <T> 
{
	
public void add(T t);

public List <T> findAll();

public T rechercher(String email);

public void editer (T t);

public void supprimer(T t);

public void maj(T t);

}
