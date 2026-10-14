package ma.ensias.employee1.service;


import ma.ensias.employee1.entite.Employe;
import ma.ensias.employee1.reponse.EmployeRessponse;
import ma.ensias.employee1.repository.EmployeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeService {

    @Autowired
    private EmployeRepo employeRepo;

    @Autowired
    private ModelMapper mapper;

    public EmployeRessponse getEmployeById(int id) {

        Optional<Employe> employe = employeRepo.findById(id);

        if (employe.isPresent()) {
            return mapper.map(employe.get(), EmployeRessponse.class);
        }

        return null;
    }
}
