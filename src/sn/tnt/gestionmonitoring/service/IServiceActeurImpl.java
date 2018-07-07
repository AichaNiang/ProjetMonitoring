package sn.tnt.gestionmonitoring.service;

import java.util.List;

import sn.tnt.gestionmonitoring.dao.IDaoAuteurImpl;
import sn.tnt.gestionmonitoring.domaine.Acteur;

public class IServiceActeurImpl implements IServiceActeur {
	private IDaoAuteurImpl dao=new IDaoAuteurImpl();
	
	@Override
	public void add(Acteur t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	@Override
	public List<Acteur> findAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Acteur rechercher(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editer(Acteur t) {
		// TODO Auto-generated method stub
		dao.editer(t);
	}

	@Override
	public void supprimer(Acteur t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	@Override
	public void maj(Acteur t) {
		// TODO Auto-generated method stub
		
	}
	public boolean connect(String login, String password) {
		
		return dao.authentification(login, password);
	}
}
