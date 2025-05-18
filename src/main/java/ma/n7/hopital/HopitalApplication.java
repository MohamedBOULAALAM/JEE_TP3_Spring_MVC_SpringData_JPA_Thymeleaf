package ma.n7.hopital;
import ma.n7.hopital.entities.Patient;
import ma.n7.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;


@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception{
         /*
         // En utilisant Constructeur sans paramètre
         Patient patient1 = new Patient();
         patient1.setId(null);
         patient1.setNom("Hassan");
         patient1.setDateNaissance(new Date());
         patient1.setMalade(false);
         patient1.setScore(10);

         // En utilisant Constructeur avec paramètre
         Patient patient2 = new Patient(null, "Ahmed", new Date(), false, 20);

         // En utilisant Builder
         Patient patient3 = Patient.builder().nom("Karim").malade(true).score(30).build();
         */

        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,34));
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4321));
        patientRepository.save(new Patient(null,"Imane",new Date(),true,34));
    }
}