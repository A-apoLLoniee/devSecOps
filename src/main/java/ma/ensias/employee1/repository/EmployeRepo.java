package ma.ensias.employee1.repository;

import ma.ensias.employee1.entite.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<Employe, Integer> {
}
