package sn.tnt.gestionmonitoring.service;

import java.util.List;

import sn.tnt.gestionmonitoring.dao.IDAORoleImpl;
import sn.tnt.gestionmonitoring.domaine.Role;

public class IServiceRoleImpl implements IServiceRole{
private IDAORoleImpl dao=new IDAORoleImpl();
	@Override
	public void add(Role t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Role rechercher(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editer(Role t) {
		// TODO Auto-generated method stub
		dao.editer(t);
	}

	@Override
	public void supprimer(Role t) {
		// TODO Auto-generated method stub
		dao.delete(t);
	}

	@Override
	public void maj(Role t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

}
