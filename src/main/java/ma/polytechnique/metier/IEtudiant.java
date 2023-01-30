package ma.polytechnique.metier;
import java.util.List;

import  ma.polytechnique.entities.*;

public interface IEtudiant {
	

	public List<Etudiant> allEtudiants();
	public List<Etudiant> findByAdmis(String admis);


}
