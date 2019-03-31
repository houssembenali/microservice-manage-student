package tn.hoos.edu;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import tn.hoos.edu.entities.Student;
import tn.hoos.edu.entities.Training;
import tn.hoos.edu.repositories.StudentRepository;
import tn.hoos.edu.repositories.TrainingRepository;

@SpringBootApplication
public class MsGestionEtudiantApplication implements CommandLineRunner{
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	TrainingRepository trainingRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MsGestionEtudiantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Expose ID because ID is default hided in rest 
		repositoryRestConfiguration.exposeIdsFor(Training.class,Student.class);
		
		Training training = trainingRepository.save(new Training(null, "Android", 10, null));
		Training training2 = trainingRepository.save(new Training(null, "JAVA", 40, null));
		Training training3 = trainingRepository.save(new Training(null, "BASE DONNEE", 15, null));
		
		
		studentRepository.save(new Student(null, "houssem", "ben ali", new Date(),training));
		studentRepository.save(new Student(null, "ahmed", "batt", new Date(),training2));
		studentRepository.save(new Student(null, "abdr", "zawi", new Date(),training3));
		studentRepository.save(new Student(null, "houssem eddine", "omar ben ali", new Date(),training2));
		studentRepository.save(new Student(null, "ahmed", "salem", new Date(),training));
		studentRepository.save(new Student(null, "walid", "languer", new Date(),training3));
		
	}

}
