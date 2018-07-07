package sn.tnt.gestionmonitoring.service;

import java.util.List;

import sn.tnt.gestionmonitoring.dao.IDaoCompte_userImpl;
import sn.tnt.gestionmonitoring.domaine.Compte_user;

public class IServiceCompteUserImpl implements IServiceCompteUser{
private IDaoCompte_userImpl dao=new IDaoCompte_userImpl();
	@Override
	public void add(Compte_user t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	@Override
	public List<Compte_user> findAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Compte_user rechercher(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editer(Compte_user t) {
		// TODO Auto-generated method stub
		dao.editer(t);
	}

	@Override
	public void supprimer(Compte_user t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	@Override
	public void maj(Compte_user t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

}
