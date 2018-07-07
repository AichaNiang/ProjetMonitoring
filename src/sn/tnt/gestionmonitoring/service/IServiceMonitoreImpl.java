package sn.tnt.gestionmonitoring.service;

import java.util.List;

import sn.tnt.gestionmonitoring.dao.IdaoMonitoreImpl;
import sn.tnt.gestionmonitoring.domaine.Monitore;

public class IServiceMonitoreImpl implements IServiceMonitore{
private IdaoMonitoreImpl dao=new IdaoMonitoreImpl();
	@Override
	public void add(Monitore t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	@Override
	public List<Monitore> findAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Monitore rechercher(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editer(Monitore t) {
		// TODO Auto-generated method stub
		dao.editer(t);
	}

	@Override
	public void supprimer(Monitore t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	@Override
	public void maj(Monitore t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

}
