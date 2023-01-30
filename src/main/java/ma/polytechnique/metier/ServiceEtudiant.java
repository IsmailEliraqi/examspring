package ma.polytechnique.metier;

import java.util.List;

import ma.polytechnique.dao.IEtudiantRepository;
import ma.polytechnique.entities.Etudiant;

public class ServiceEtudiant implements IEtudiant {
	
	IEtudiantRepository metier ;
	
	@Override
	public List<Etudiant> allEtudiants() {

		return metier.findAll();
	}

	@Override
	public List<Etudiant> findByAdmis(String admis) {
		
		return metier.findByAdmis(admis);
	}



	
}
