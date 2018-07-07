package sn.tnt.gestionmonitoring.service;

import java.util.List;

import sn.tnt.gestionmonitoring.dao.IDaoChaineImpl;
import sn.tnt.gestionmonitoring.domaine.Chaine;

public class IServiceChaineImpl implements IServiceChaine{
	private IDaoChaineImpl dao=new IDaoChaineImpl();
	@Override
	public void add(Chaine t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	@Override
	public List<Chaine> findAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Chaine rechercher(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editer(Chaine t) {
		// TODO Auto-generated method stub
		dao.editer(t);
	}

	@Override
	public void supprimer(Chaine t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	@Override
	public void maj(Chaine t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

}
