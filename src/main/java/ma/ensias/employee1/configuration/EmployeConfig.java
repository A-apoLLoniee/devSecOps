package ma.ensias.employee1.configuration;


import ma.ensias.employee1.service.EmployeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeConfig {

    @Bean
    public EmployeService employeBean() {
        return new EmployeService();
    }

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
