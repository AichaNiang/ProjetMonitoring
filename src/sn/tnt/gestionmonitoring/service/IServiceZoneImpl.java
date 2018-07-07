package sn.tnt.gestionmonitoring.service;

import java.util.List;

import sn.tnt.gestionmonitoring.dao.IDAOZoneImpl;
import sn.tnt.gestionmonitoring.domaine.Zone;

public class IServiceZoneImpl implements IServiceZone{
private IDAOZoneImpl dao=new IDAOZoneImpl();
	@Override
	public void add(Zone t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	@Override
	public List<Zone> findAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Zone rechercher(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editer(Zone t) {
		// TODO Auto-generated method stub
		dao.editer(t);
	}

	@Override
	public void supprimer(Zone t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	@Override
	public void maj(Zone t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

}
