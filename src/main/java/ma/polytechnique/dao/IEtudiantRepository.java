package ma.polytechnique.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.polytechnique.entities.Etudiant;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer>{

	List<Etudiant> findByAdmis(String admis);

}
